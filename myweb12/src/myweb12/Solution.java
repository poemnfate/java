package myweb12;

import java.io.*;
import java.util.*;

public class Solution {
	
	public int maxSolution(int[] array) {
		int answer=0;
		int max=0;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		
		for(int i=0;i<array.length;i++) {
			if(hm.get(array[i]) == null) {
				hm.put(array[i], 1);
				
			}else {
				hm.put(array[i],(hm.get(array[i])+1));
				
			}
		}
		int hm_max=0;
		for(int i=0;i<array.length;i++) {
			hm_max=hm_max<=hm.get(array[i])?hm.get(array[i]):hm_max;
		}
		
		for(int i=0;i<array.length;i++) {
			if(hm.get(array[i])!=null) {
				int array_max=hm.get(array[i]);
				if(hm_max==array_max) {
					max++;
					answer=array[i];
					hm.remove(array[i]);
					
				}
			}
		}
		if(max>1) {
			return -1;
		}else {
			return answer;
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		
		/*
		 * 최빈값 구하기
		 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
		 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요
		 * 최빈값이 여러 개면 -1을 return 합니다.
		 * 
		 * 입출력 예시
		 * [1, 2, 3, 3, 3, 4] ->	3
		 * [1, 1, 2, 2] ->	-1
		 * [1] ->	1
		 * 
		 * */
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("배열의 길이를 입력하세요 >");
		int len=Integer.parseInt(br.readLine());
		int arr[]=new int[len];
		for(int i=0;i<len;i++) {
			System.out.print((i+1)+"번째 배열의 수 >");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		Solution s=new Solution();
		
		int max=s.maxSolution(arr);
		System.out.println("최빈값 = > "+max);

	}

}
