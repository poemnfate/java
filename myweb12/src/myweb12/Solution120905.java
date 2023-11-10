package myweb12;

import java.io.*;

public class Solution120905 {

	public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int cnt=0;
        for(int i=0;i<numlist.length;i++) {
        	if(numlist[i]%n==0) {
        		cnt++;
        	}
        }
        answer=new int[cnt];
        cnt=0;
        for(int i=0;i<numlist.length;i++) {
        	if(numlist[i]%n==0) {
        		answer[cnt]=numlist[i];
        		cnt++;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 n을 입력하세요 >");
		int n=Integer.parseInt(br.readLine());
		System.out.print("배열의 크기를 입력하세요 >");
		int len=Integer.parseInt(br.readLine());
		
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			System.out.print(i+1+"번째 배열의 숫자를 입력하세요 >");
			arr[i]=Integer.parseInt(br.readLine());
		}
		Solution120905 s=new Solution120905();
		int[] result=s.solution(n, arr);
		for(int i=0;i<result.length;i++) {
        	System.out.print(result[i]+"\t");
        }

	}

}
