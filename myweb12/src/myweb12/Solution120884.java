package myweb12;

import java.io.*;

public class Solution120884 {
	
	 public int solution(int chicken) {
	        int answer = -1;
	        int s_chicken=0;
	        int coupon=0;
	        while(chicken>=10) {
        		s_chicken+=chicken/10;
	        	//coupon+=chicken%10==0?1:chicken%10;
	        	if(chicken%10==0) {
	        		if(chicken==100) {
	        			coupon+=1;
	        		}
	        	}else {
	        		coupon+=chicken%10;
	        	}
	        	chicken/=10;
        	}
	        coupon+=chicken;
	        System.out.println(coupon);
	        while(coupon>=10) {
	        	s_chicken+=coupon/10;
	        	coupon=coupon%10+coupon/10;
	        }
	   
	        answer=s_chicken;
	        return answer;
	    }
	public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시켜먹은 치킨의 수 >");
		int chicken=Integer.parseInt(br.readLine());
		
		Solution120884 s=new Solution120884();
		int result=s.solution(chicken);
		System.out.println("최대 서비스 치킨의 수 = >"+result);
		
	}

}
