package arraytest;

public class TwoDimArrTest_02 {

	public static void main(String[] args) {
		
		int arr[][]=new int[5][5];
		
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				arr[i][j]=count++;
			}
		}
		
		System.out.println("# 2차원 배열의 값 삼각형으로 출력 #");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
