package example;

import java.io.*;
import java.util.*;

public class Scode465 {

	public static void main(String[] args)throws IOException {
		
		// 문자열 압축하기
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("알파벳 문자열을 입력하세요"); 
		String str=br.readLine();
		System.out.println("알파벳 문자열의 길이 : "+str.length());
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(i==0) {
				hm.put(c, 1);
			}else {
				if(hm.get(c)==null) {
					hm.put(c, 1);
				}else {
					int cnt=hm.get(c);
					cnt++;
					hm.replace(c, cnt);
				}
			}
		}
		System.out.print("출력 예시 : ");
		
		System.out.print(hm.toString());
		

	}

}
