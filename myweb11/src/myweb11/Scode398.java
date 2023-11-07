package myweb11;

import java.io.*;

public class Scode398 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 >");
		String num=br.readLine();
		String rvnum=new StringBuilder(num).reverse().toString();
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<rvnum.length();i++) {
			
			if(i%3==0 && i!=0 &&rvnum.charAt(i-1)!='.') {
				
				sb.insert(0,",");
			}
			sb.insert(0, rvnum.charAt(i));
		}
		System.out.println("숫자 >"+num);
		System.out.println("금액 >"+sb);

	}

}
