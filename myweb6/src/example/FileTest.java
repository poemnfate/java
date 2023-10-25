package example;

import java.io.*;


public class FileTest {

	public static void main(String[] args) {

		int upper = 0; //대문자 갯수
		int lower = 0; //소문자 갯수
		int num = 0; // 숫자 갯수
		
		try {
			FileReader fr = new FileReader("C:/studyjava/test.txt");
			
			int code = 0;
			
			while((code = fr.read()) != -1) {
				
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
				if(code >= 'a' && code <= 'z') {
					lower++;
				}
				if(code>=0 && code<=9) {
					num++;
				}
				
			}
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			System.out.println("숫자 : " + num);
			
			fr.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	}


