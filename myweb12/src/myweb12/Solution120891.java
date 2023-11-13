package myweb12;

import java.io.*;

public class Solution120891 {

	public int solution(int order) {
        int answer = 0;
        String str=String.valueOf(order);
        
        for(int i=0;i<str.length();i++) {
        	char num=str.charAt(i);
        	if(num=='3' || num=='6'||num=='9') {
        		answer+=1;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("머쓱이 >");
		int order=Integer.parseInt(br.readLine());
		
		Solution120891 s=new Solution120891();
		int result=s.solution(order);
		
		System.out.println("머쓱이가 쳐야할 박수 횟수 = > "+result);

	}

}
