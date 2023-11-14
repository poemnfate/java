package myweb12;

import java.io.*;

public class Solution181852 {
	
	public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        for(int i=0;i<num_list.length-1;i++) {
        	for(int j=i;j<num_list.length;j++) {
        		if(num_list[i]<num_list[j]) {
        			int temp=num_list[i];
        			num_list[i]=num_list[j];
        			num_list[j]=temp;
        		}
        	}
        }
        int cnt=0;
        for(int i=5;i<num_list.length;i++) {
        	answer[cnt]=num_list[i];
        	cnt++;
        }
        return answer;
    }

	public static void main(String[] args) throws IOException{
		
		/* 뒤에서 5등 위로
		정수로 이루어진 리스트 num_list가 주어집니다. 
		num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 
		return하도록 solution 함수를 완성해주세요.
		
		*/

	}

}
