package example;

import java.util.*;

public class Scode393 {
	
	public static void main(String[] args) {
		
		//1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?

		//8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
		//(※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 함)
		
		int cnt=0;
		for(int i=1;i<=10000;i++) {
				
			String num=Integer.toString(i);
				
			for(int j=0;j<num.length();j++) {
				char n=num.charAt(j);
				if((n-48)==8) { 
					//char형과 정수형을 비교할 때
					//char n에는 문자가 들어있어서 비교 전에 48을 빼줘야 함
					cnt++;
				}
			}
				
			
		}
		System.out.println("1부터 10,000까지 8이라는 숫자는 총 몇번 나오는가?"+cnt);

	}

}
