package myweb14;

public class Solution181903 {
	
	public String solution(int q, int r, String code) {
        String answer = "";
        for(int i=0;i<code.length();i++) {
        	if(i%q==r) {
        		answer+=code.substring(i,i+1);
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		/*
		 * qr code
		 * 
		 * 두 정수 q, r과 문자열 code가 주어질 때, code의 각 인덱스를 q로 나누었을 때 
		 * 나머지가 r인 위치의 문자를 앞에서부터 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		 * 
		 * 예시
		 * 3,	1,	"qjnwezgrpirldywt" -> 	"jerry"
		 * 1,	0,	"programmers" ->	"programmers"
		 * 
		 * 
		 * */
		Solution181903 s=new Solution181903();
		int q=3;
		int r=1;
		String code="qjnwezgrpirldywt";
		s.solution(0, 0, null);
	}

}
