package myweb13;


public class Soluiton181905 {
	
	public String solution(String my_string, int s, int e) {
        String answer = "";
        answer=my_string.substring(s,e+1);
        String rev_string=new StringBuilder(answer).reverse().toString();
        answer=my_string.replaceAll(answer, rev_string);
        return answer;
    }

	public static void main(String[] args) {
		
		/*
		 * 문자열 뒤집기
		 * 
		 * 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, 
		 * my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 
		 * return 하는 solution 함수를 작성해 주세요.
		 * 
		 * 예시
		 * 
		 * "Progra21Sremm3",	6,	12	-> "ProgrammerS123"
		 * "Stanley1yelnatS",	4,	10	-> "Stanley1yelnatS"
		 * 
		 * 
		 * */
		Soluiton181905 so=new Soluiton181905();
		
		String my_string="Progra21Sremm3";
		int s=6;
		int e=12;
		so.solution(my_string, s, e);
		
	}

}
