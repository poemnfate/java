package myweb11;

import java.io.*;
import java.util.*;

public class Scode589 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 공백을 제외한 글자수 세기
		 * 
		 * 어떠한 문자열을 입력받았을 때 줄바꿈과 공백을 제외한 글자수만을 리턴하는 코드를 작성하시오.
		 * 
		 * 입력 예시
			공백을 제외한
			글자수만을 세는 코드 테스트
			
		 * 출력 예시	
			18
		 * 
		 * 
		 * */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열 입력 >");
		String str=br.readLine();
		System.out.println("글자수 >"+str.replaceAll("[^a-zA-zㄱ-힣]", "").length());

	}

}
