package myweb11;

import java.io.*;

public class Scode555 {

	public static void main(String[] args) throws Exception {
		
		/*
		 * 시저 암호 풀기
		 * 
		 * 시저 암호는, 고대 로마의 황제 줄리어스 시저가 만들어 낸 암호인데, 예를 들어 알파벳 A를 입력했을 때
		 * 그 알파벳의 n개 뒤에 오는(여기서는 예를 들 때 3으로 지정하였다)알파벳이 출력되는 것이다. 
		 * 예를 들어 바꾸려는 단어가 'CAT"고, n을 5로 지정하였을 때 "HFY"가 되는 것이다.
		 * 어떠한 암호를 만들 문장과 n을 입력했을 때 암호를 만들어 출력하는 프로그램을 작성해라.
		 * 
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		do {
			System.out.print("단위가 되는 n 입력(1~26 사이) >");
			n=Integer.parseInt(br.readLine());
		}while(!(n>0 && n<26));
		
		System.out.print("알파벳 단어 입력 >");
		String str=br.readLine();
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			String spaceb=str.substring(i,i+1);
			if(spaceb.equals("")) {
				sb.append(" ");
				continue;
			}
			int c=str.charAt(i);
			char c2=(char)(c+n);
			sb.append(c2);
		}
		System.out.println("시저 암호된 알파벳 단어 >"+sb);

	}

}
