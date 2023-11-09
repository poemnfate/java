package myweb12;

import java.io.*;

public class Solution120815 {
	
	public int Solution(int n) {
		int answer=0;
		int n_sum=n;
		while(n_sum%6!=0) {
			n_sum=n_sum+n;
		}
		answer=n_sum/6;
		return answer;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("피자를 나눠먹을 인원수 >");
		int n=Integer.parseInt(br.readLine());
		Solution120815 s=new Solution120815();
		int result=s.Solution(n);
		System.out.println(n+"명이 모두 같은 양을 먹기 위해 "+result+"판을 시켜야 ");
		System.out.println(result*6+"조각으로 다 같이 먹을 수 있습니다");
	}

}
