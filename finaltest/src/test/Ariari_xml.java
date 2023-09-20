package test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.sql.*;

public class Ariari_xml {
	
	public static String getTagValue(String tag, Element eElement) {

    	//결과를 저장할 result 변수 선언
    	String result = "";

	NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();

	result = nlList.item(0).getTextContent();

	return result;
	}
	
	// tag값의 정보를 가져오는 함수
	public static String getTagValue(String tag, String childTag, Element eElement) {

		//결과를 저장할 result 변수 선언
		String result = "";

		NodeList nlList = eElement.getElementsByTagName(tag).item(0).getChildNodes();

		for(int i = 0; i < eElement.getElementsByTagName(childTag).getLength(); i++) {

			//result += nlList.item(i).getFirstChild().getTextContent() + " ";
			result += nlList.item(i).getChildNodes().item(0).getTextContent() + " ";
		}

		return result;
	}

	public static void main(String[] args) {
		String key = "";
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dburl="jdbc:oracle:thin:@localhost:1521:xe";
			String dbuser="scott";
			String dbpwd="1234";

			Connection conn=DriverManager.getConnection(dburl,dbuser,dbpwd);
			PreparedStatement ps=null;
			
			// parsing할 url 지정(API 키 포함해서)
			String url = "http://apis.data.go.kr/B551011/KorService1/detailInfo1?ServiceKey="+key+"&contentTypeId=25&contentId=2011494&MobileOS=ETC&MobileApp=AppTest";

			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);
			
			// 제일 첫번째 태그
			doc.getDocumentElement().normalize();
			
			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("item");

			for(int temp = 0; temp < nList.getLength(); temp++){
				Node nNode = nList.item(temp);
			
				Element eElement = (Element) nNode;
				
				System.out.println("콘텐츠ID : " + getTagValue("contentid", eElement));
				System.out.println("코스번호 : " + getTagValue("subnum", eElement));
				System.out.println("코스장소 : " + getTagValue("subname", eElement));
				System.out.println("이미지 : " + getTagValue("subdetailimg", eElement));
				
				String sql="insert into final_test values(?,?,?,?)";
				ps=conn.prepareStatement(sql);
				ps.setString(1, getTagValue("contentid", eElement));
				ps.setString(2, getTagValue("subnum", eElement));
				ps.setString(3, getTagValue("subname", eElement));
				ps.setString(4, getTagValue("subdetailimg", eElement));
				
				
				int count=ps.executeUpdate();
				
				if(count>0) {
					System.out.println("OOO 등록 성공! OOO");
				}else {
					System.out.println("XXX 등록 실패! XXX");
				}

			}
			ps.close();
			conn.close();

			
		} catch (Exception e){	
			e.printStackTrace();
		}

	}

}
