package myweb13;

import java.io.*;

public class Solution181834 {
	
	public String solution(String myString) {
       String answer="";
       answer=myString.replaceAll("[a-l]", "l");
        return answer;
    }

	public static void main(String[] args) {
		/*
		 * l로 만들기
		 * 
		 * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 
		 * 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 
		 * return 하는 solution 함수를 완성해 주세요.
		 * 
		 * 예시
		 * 
		 * "abcdevwxyz" ->  	"lllllvwxyz"
		 * "jjnnllkkmm" ->  	"llnnllllmm"
		 * 
		 * 
		 * */
		
		Solution181834 s=new Solution181834();
		s.solution("");

	}

}