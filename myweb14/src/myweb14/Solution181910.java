package myweb14;

public class Solution181910 {
	
	public StringBuffer solution(String my_string, int n) {
        StringBuffer answer = new StringBuffer();
        my_string=new StringBuilder(my_string).reverse().toString();
        for(int i=0;i<n;i++) {
        	answer.insert(0, my_string.charAt(i));
        }
        return answer;
    }

	public static void main(String[] args) {
		
		/*
		 * 문자열의 뒤의 n글자
		 * 
		 * 문자열 my_string과 정수 n이 매개변수로 주어질 때, 
		 * my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.
		 * 
		 * 예시
		 * 
		 * "ProgrammerS123",	11 -> 	"grammerS123"
		 * "He110W0r1d",	5 ->	"W0r1d"
		 * 
		 * 
		 * */
		Solution181910 s=new Solution181910();
		
		String my_string="ProgrammerS123";
		int n=11;
		s.solution(my_string, n);

	}

}
