package myweb12;

import java.io.*;

public class Solution120892 {
	
	public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code-1;i<cipher.length();i=i+code) {
        	answer+=cipher.substring(i,i+1);
        }
        return answer;
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.

		 * 암호화된 문자열 cipher를 주고받습니다.
		 * 그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
		 * 문자열 cipher와 정수 code가 매개변수로 주어질 때 
		 * 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 예시
		 * "dfjardstddetckdaccccdegk",	4 ->	"attack"
		 * "pfqallllabwaoclk"	2 ->	"fallback"
		 * 
		 * */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("암호화된 문자열 >");
		String cipher=br.readLine();
		System.out.print("진짜 암호를 출력할 정수 >");
		int code=Integer.parseInt(br.readLine());
		
		Solution120892 s=new Solution120892();
		String result=s.solution(cipher, code);
		System.out.println("해독된 암호 >"+result);
		
		

	}

}
