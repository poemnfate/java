package myweb12;

import java.io.*;

public class Solution120819 {
	
	 public int[] solution(int money) {
	        int[] answer = {0,0};
	        while(money>=5500) {
	        	answer[0]+=1;
	        	money-=5500;
	        }
	        answer[1]=money;
	        return answer;
	    }

	public static void main(String[] args) throws IOException{
		
		/*
		 * 아이스 아메리카노
		 * 
		 * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 
		 * 아이스 아메리카노는 한잔에 5,500원입니다. 
		 * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 
		 * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 
		 * return 하도록 solution 함수를 완성해보세요.
		 * 
		 * 예시
		 * 
		 * 5,500 -> 	[1, 0]
		 * 15,000-> 	[2, 4000]
		 * 
		 * */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Solution120819 s=new Solution120819();
		System.out.print("머쓱이가 가지고 있는 돈 >");
		int money=Integer.parseInt(br.readLine());
		int[] result=s.solution(money);
		
		System.out.println("머쓱이가 마실 수 있는 아메리카노 잔 : "+result[0]);
		System.out.println("잔돈 : "+result[1]);

	}

}
