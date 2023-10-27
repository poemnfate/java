package example;

import java.io.*;

public class TriangleTest {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int size[]= {0,0,0};
		int sum=0;
		int ye=0;
		int zic=0;
		int dun=0;
		
		for(int i=0;i<size.length;i++) {
			System.out.print(i+1+"번째 삼각형 각도 입력:");
			size[i]=Integer.parseInt(br.readLine());
			if(size[i]<=0) {
				System.out.println("※ 삼각형의 각도는 0보다 커야합니다.");
				i--;
				continue;
			}
			if(size[i]==90) {
				zic++;
			}else {
				if(size[i]<90) {
					ye++;
				}else {
					dun++;
				}
			}
			sum+=size[i];
		}
		if(sum!=180) {
			System.out.println("삼각형이 아닙니다.");
		}else{
			if(zic==1) {
				System.out.println("△ 직각삼각형입니다.");
			}else if(zic==2 || zic==3) {
				System.out.println("삼각형이 아닙니다.");
			}else {
				if(dun==1) {
					System.out.println("△ 둔각삼각형입니다.");
				}else if(dun>1){
					 System.out.println("삼각형이 아닙니다.");
				}else {
					 System.out.println("△ 예각삼각형입니다.");
				}
			}
		}
		
		
		
		
	}

}
