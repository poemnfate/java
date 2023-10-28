package example;

public class Scode393 {

	public static void main(String[] args) {
		int cnt=0;
		for(int i=1;i<=10000;i++) {
			
			if(i%10==8) {
				cnt++;
				
			}
			for(int j=10;j<=i;j=j*10) {
					if((i/j)%10==8) {
						cnt++;
					}
				}
		}
		System.out.println("1부터 10,000까지 8이라는 숫자는 총 몇번 나오는가?"+cnt);

	}

}
