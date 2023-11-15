package myweb13;

import java.io.*;

public class Solution181838 {
	
	public int solution(int[] date1, int[] date2) {
        int answer = 0;
        for(int i=0;i<date1.length;i++) {
        	if(date1[i]>date2[i]) {
        		return 0;
        	}else if(date1[i]<date2[i]) {
        		return 1;
        	}else {
        		continue;
        	}
        }
        return answer;
    }

	public static void main(String[] args) throws IOException {
		
		/*
		 * 날짜 비교하기
		 * 
		 * 정수 배열 date1과 date2가 주어집니다. 
		 * 두 배열은 각각 날짜를 나타내며 [year, month, day] 꼴로 주어집니다. 
		 * 각 배열에서 year는 연도를, month는 월을, day는 날짜를 나타냅니다.
		 * 만약 date1이 date2보다 앞서는 날짜라면 1을, 아니면 0을 return 하는 solution 함수를 완성해 주세요.
		 * 
		 * 
		 * 예시 
		 * 
		 * [2021, 12, 28],	[2021, 12, 29]->  	1
		 * [1024, 10, 24], 	[1024, 10, 24]->  	0
		 * 
		 * 
		 * */
		
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] date1=new int[3];
		int[] date2=new int[3];
		System.out.print("date1 년 >");
		date1[0]=Integer.parseInt(br.readLine());
		System.out.print("date1 월 >");
		date1[1]=Integer.parseInt(br.readLine());
		System.out.print("date1 일 >");
		date1[2]=Integer.parseInt(br.readLine());
		
		System.out.print("date2 년 >");
		date2[0]=Integer.parseInt(br.readLine());
		System.out.print("date2 월 >");
		date2[1]=Integer.parseInt(br.readLine());
		System.out.print("date2 일 >");
		date2[2]=Integer.parseInt(br.readLine());
		
		Solution181838 s=new Solution181838();
		int result=s.solution(date1, date2);
		System.out.println(result);
		
		

	}

}
