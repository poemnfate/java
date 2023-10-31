package example;

import java.io.*;

public class Scode458 {

	public static void main(String[] args) throws Exception {
		//10진수를 n진수로 변환하기
		
		//2진수로 변환 : 23310 --> 111010012
		//8진수로 변환 : 23310 --> 3518
		//16진수로 변환 : 23310 --> E916
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer();
		System.out.print("변환할 진수 입력 >");
		int zinsu=Integer.parseInt(br.readLine());
		
		System.out.print("10진수 숫자 입력 >");
		int num=Integer.parseInt(br.readLine());
		
		char[] arr= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		System.out.print(num+"(10진수) -> ");
		while(num>0) {
			sb.insert(0,arr[num%zinsu]); //나머지 숫자를 역순으로 출력해야 하기 때문에 0번째 인덱스에 계속 추가
			num=num/zinsu;
		}
		
		System.out.print(sb+"("+zinsu+"진수)");
		
	}	
}		
