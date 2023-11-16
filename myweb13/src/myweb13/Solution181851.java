package myweb13;

import java.io.*;
import java.util.*;

public class Solution181851 {
	
	public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int cnt=1;
        HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<rank.length;i++) {
        	if(attendance[i]) {
        		hm.put(rank[i], i);
        	}
        }
        for(int i=1;i<=rank.length;i++) {
        	if(cnt>3) {
        		return answer;
        	}
        	if(hm.get(i)!=null) {
        	switch(cnt) {
	        	case 1: answer+=10000*hm.get(i); break;
	        	case 2: answer+=100*hm.get(i);break;
	        	case 3: answer+=1*hm.get(i); break;
	        	
	        	}
        		cnt++;
        	}
        	
        }
        return answer;
    }

	public static void main(String[] args) throws IOException {
		
		/*
		 * 전국 대회 선발 고사
		 * 
		 * 0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 
		 * 등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 
		 * 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
		 * 각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 
		 * 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어집니다. 
		 * 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 
		 * 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
		 * 
		 * 예시
		 * 
		 * [3, 7, 2, 5, 4, 6, 1],	[false, true, true, true, true, false, false] ->	20403
		 * [1, 2, 3],	[true, true, true]->	102
		 * [6, 1, 5, 2, 3, 4],	[true, false, true, false, false, true]->	50200
		 * 
		 * */
		Solution181851 s=new Solution181851();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("선발 고사에 참여한 학생 수 >");
		int snum=Integer.parseInt(br.readLine());
		
		int[] rank=new int[snum];
		boolean[] attend=new boolean[snum];
		
		for(int i=0;i<snum;i++) {
			System.out.print(i+1+"번째 학생의 등수 >");
			rank[i]=Integer.parseInt(br.readLine());
			System.out.print(i+1+"번재 학생의 참석여부 >");
			attend[i]=Boolean.parseBoolean(br.readLine());
		}
		
		int result=s.solution(rank, attend);
		System.out.println("결과 : "+result);

	}

}
