package example;

import java.io.*;

public class ArrayActorTest {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[][] actor= {
				{"[song]","박쥐","괴물","관상"},
				{"[kim]", "도둑들", "수상한 그녀", "은밀하게 위대하게"}, 
				{"[lee]", "지아이조", "레드", "광해"}
				
		};
		
		System.out.print("검색할 배우 : ");
		String bname=br.readLine();
		bname="["+bname+"]";
		int cnt=0;
		for(int i=0;i<actor.length;i++) {
			if(actor[i][0].equals(bname)) {
				System.out.println(bname);
				for(int j=1;j<actor[i].length;j++) {
					System.out.println(actor[i][j]);
				}
			}else {
				cnt++;
			}
		}
		if(cnt==actor.length) {
			System.out.println("해당 배우가 존재하지 않습니다.");
		}

	}

}
