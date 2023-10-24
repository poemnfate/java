package example;

import java.util.*;

public class IdPwTest {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim", 1111);
		map.put("lee", 2222);
		map.put("park", 3333);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("id : ");
		String id = sc.next();
		
		System.out.print("pw : ");
		int pw = sc.nextInt();
		
		if(!map.containsKey(id)) {//map.containsKey(id) == false
			System.out.println("아이디가 존재하지 않습니다.");
		}
		else {
			//존재하는 아이디를 입력받은 경우
			if(map.get(id) != pw) {
				System.out.println("비밀번호 불일치");
			}
			else {
				System.out.println("로그인 성공!");
			}
			
		}

	}

}
