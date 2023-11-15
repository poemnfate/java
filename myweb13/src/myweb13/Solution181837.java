package myweb13;

import java.io.*;

public class Solution181837 {
	
	public int solution(String[] order) {
        int answer = 0;
        for(int i=0;i<order.length;i++) {
        	if(order[i].length()==9 ) {
        		
        	}else if(order[i].charAt(0)=='i' || order[i].charAt(0)=='h') {
        		order[i]=order[i].substring(3);
        	}else {
        		order[i]=order[i].substring(0,9);
        	}
        	
        	if(order[i].equals("americano")||order[i].equals("anything")) {
        		answer+=4500;
        	}else if(order[i].equals("cafelatte")){
        		answer+=5000;
        	}
        }
        return answer;
    }

	public static void main(String[] args) throws Exception {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("메뉴 개수 >");
		int cnt=Integer.parseInt(br.readLine());
		
		String[] order=new String[cnt];
		for(int i=0;i<cnt;i++) {
			System.out.print(i+1+"번째 메뉴 입력");
			order[i]=br.readLine();
		}
		Solution181837 s=new Solution181837();
		int result=s.solution(order);
		System.out.println("결제해야할 총 금액 ="+result);

	}

}
