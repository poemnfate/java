package myweb13;

public class Solution181904 {
	
	public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i=c-1;i<my_string.length();i=i+m) {
        			answer+=my_string.substring(i,i+1);	
        }
        
        return answer;
    }

	public static void main(String[] args) {
		/*
		 * 세로 읽기
		 * 
		 * 문자열 my_string과 두 정수 m, c가 주어집니다. 
		 * my_string을 한 줄에 m 글자씩 가로로 적었을 때 왼쪽부터 세로로 c번째 열에 적힌 글자들을 
		 * 문자열로 return 하는 solution 함수를 작성해 주세요.
		 * 
		 * 예시
		 * 
		 * "ihrhbakrfpndopljhygc",	4,	2 ->	"happy"
		 * "programmers",	1,	1 ->	"programmers"
		 * */
		
		Solution181904 s=new Solution181904();
		String my_string="ihrhbakrfpndopljhygc";
		int m=4;
		int c=2;
		

	}

}
