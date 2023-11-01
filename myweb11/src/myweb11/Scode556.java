package myweb11;

import java.io.*;

public class Scode556 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("10진수 입력 >");
		int num=Integer.parseInt(br.readLine());
		StringBuffer sb=new StringBuffer();
		while(num>0) {
			sb.insert(0, num%2);
			num=num/2;
		}
		System.out.println("2진수 출력 >"+sb);
	}

}
