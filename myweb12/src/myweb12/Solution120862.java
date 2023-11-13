package myweb12;

import java.io.*;

public class Solution120862 {
	
	public int solution(int[] numbers) {
        int answer = 0;
        for(int i=0;i<numbers.length-1;i++) {
        	for(int j=i;j<numbers.length;j++) {
        		if(numbers.length==2) {
        			answer=numbers[i]*numbers[j];
        		}
        		if(i!=j&&answer<numbers[i]*numbers[j]) {
        			answer=numbers[i]*numbers[j];
        		}
        	}
        }
        return answer;
    }

	public static void main(String[] args) throws IOException{
		
		/*
		 * 최댓값 구하기(2)
		 * 
		 * 정수 배열 numbers가 매개변수로 주어집니다. 
		 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
		 * 
		 * 예시
		 * 
		 * [1, 2, -3, 4, -5] -> 	15
		 * [0, -31, 24, 10, 1, 9] -> 	240
		 * [10, 20, 30, 5, 5, 20, 5]->  	600
		 * 
		 * 
		 * */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열의 크기 >");
		int len=Integer.parseInt(br.readLine());
		int[] numbers=new int[len]; 
		for(int i=0;i<len;i++) {
			System.out.print(i+1+"번째 배열의 수 >");
			numbers[i]=Integer.parseInt(br.readLine());
		}
		
		Solution120862 s=new Solution120862();
		int result=s.solution(numbers);
		
		System.out.println("최댓값 = > "+result);

	}

}
