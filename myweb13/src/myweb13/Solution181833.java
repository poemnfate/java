package myweb13;

import java.io.*;

public class Solution181833 {
	
	public int[][] solution(int n) {
		 int[][] answer = new int [n][n];
	        for(int i=0;i<n;i++) {
	        	answer[i][i]=1;
	        }        
	       return answer;
    }
	
	public static void main(String[] args)throws IOException {
		
		/*
		 * 특별한 이차원 배열 1
		 * 
		 * 정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 
		 * 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
		 * 
		 * */
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("정수 n 입력 >");
	int n=Integer.parseInt(br.readLine());
	
	Solution181833 s=new Solution181833();
	s.solution(n);		
	}

}
