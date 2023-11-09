package myweb12;

import java.io.*;

public class Solution120816 {
	
	public int Solution(int slice, int n) {
		int answer=0;
		answer=n%slice==0?n/slice:(n/slice)+1;
		
		return answer;
	}

	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("피자 조각 수 >");
		int slice=Integer.parseInt(br.readLine());
		System.out.print("먹는 사람 수 >");
		int n=Integer.parseInt(br.readLine());
		
		Solution120816 s=new Solution120816();
		int result=s.Solution(slice, n);
		
		System.out.println(n+"명이 "+slice+"조각으로 자른 피자를 한 조각 이상씩 먹으려면");
		System.out.println("최소 "+result+"판을 시켜야합니다");

	}

}
