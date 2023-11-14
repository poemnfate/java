package myweb12;

import java.io.*;

public class Solution181847 {
	
	public String solution(String n_str) {
        String answer = "";
        int cnt=0;
        while(n_str.charAt(cnt)=='0') {
        	n_str=n_str.substring(cnt+1);
        }
        answer=n_str;
        return answer;
    }

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수로 이루어진 문자열 >");
		String str=br.readLine();
		
		Solution181847 s=new Solution181847();
		String result=s.solution(str);
		
		System.out.println("결과 : "+result);
		
	}

}
