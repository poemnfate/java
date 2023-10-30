package example;

import java.io.*;
import java.util.*;

public class Scode465 {

	public static void main(String[] args)throws IOException {
		
		//문자열 압축하기
		//문자열을 입력받아서, 같은 문자가 연속적으로 반복되는 경우에 그 반복 횟수를 표시하여 문자열을 압축하기.
		//입력 예시: aaabbcccccca
		//출력 예시: a3b2c6a1
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("알파벳 문자열을 입력 : "); 
		String str=br.readLine();
		System.out.println("알파벳 문자열의 길이 : "+str.length());
		char printa=0;
		int printc=0;
		System.out.print("출력 : ");
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			if(i==0) {
				printa=c;
				printc=1;
			}else {
				if(c==printa) {
					printc++;
				}else {
					System.out.print(printa);
					System.out.print(printc);
					printa=c;
					printc=1;
				}
			}
		}
		
		System.out.print(printa);
		System.out.print(printc);
		

	}

}
