package myweb12;

import java.io.*;

public class Solution120826 {
	
	public String Solution(String my_string, String letter) {
		
		my_string=my_string.replaceAll(letter, "");
		
		return my_string;
	}

	public static void main(String[] args) throws IOException{
		
		/*
		 * 특정 문자 제거하기
		 * 
		 * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
		 * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 my_string >");
		String my_string=br.readLine();
		System.out.print("문자 letter >");
		String letter=br.readLine();
		
		Solution120826 s=new Solution120826();
		String str=s.Solution(my_string, letter);
		System.out.println(my_string+"에서 "+letter+"를 제외한 문자열 >"+str);
	}

}
