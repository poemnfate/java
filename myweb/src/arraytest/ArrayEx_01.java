package arraytest;

public class ArrayEx_01 {

	public static void main(String[] args) {
		
		int c[]=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int sum1=0; //홀수
		int sum2=0; //짝수
		
		for(int i=0;i<c.length;i++) {
			if(c[i]%2==0) {
				sum2+=c[i];
			}else {
				sum1+=c[i];
			}
		}
		
		System.out.println("배열 내 짝수의 합 = "+sum2+", 홀수의 합 = "+sum1);

	}

}
