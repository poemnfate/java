package myweb12;

import java.io.*;

public class Solution120834 {
	
	public String solution(int age) {
		String answer = "";
        String age1=String.valueOf(age);
        for(int i=0;i<age1.length();i++) {
        	answer+=(char)(age1.charAt(i)+49);
        	
        }
        return answer;
    }

	public static void main(String[] args) throws IOException{
		
		/*
		 * 외계행성의 나이
		 * 
		 * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 
		 * 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. 
		 * a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
		 * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 예시
		 * 23 ->	"cd"
		   51 ->	"fb"
		   100->	"baa"
		 * 
		 * */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이를 입력하세요 >");
		int age=Integer.parseInt(br.readLine());
		
		Solution120834 s=new Solution120834();
		String result=s.solution(age);
		System.out.println("PROGRAMMER-962 행성의 나이 => "+result);
		

	}

}
