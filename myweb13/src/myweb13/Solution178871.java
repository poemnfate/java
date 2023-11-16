package myweb13;


import java.util.*;

public class Solution178871 {
	
	 public String[] solution(String[] players, String[] callings) {
	        String[] answer = {};
	        HashMap<String, Integer> hm=new HashMap<String, Integer>();
	        for(int i=0;i<players.length;i++) {
	        	hm.put(players[i], i);
	        }
	        for(int i=0;i<callings.length;i++) {
	        	int num=hm.get(callings[i]);
	        	String temp=players[num-1];
	        	players[num-1]=players[num];
	        	players[num]=temp;
	        	hm.put(callings[i], num-1);
	        	hm.put(temp, num);
	        }
	        answer=players;
	        return answer;
	    }

	public static void main(String[] args) {
		Solution178871 s=new Solution178871();
		
		String[] players= {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings= {"kai", "kai", "mine", "mine"};
	}

}
