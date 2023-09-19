package arraytest;

public class TwoDimArrTest_03 {

	public static void main(String[] args) {
		
		int arr[][]=new int[5][5];
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=0;j<i;j++) {
				arr[i][j]=0;
			}
			for(int j=i;j<arr[i].length;j++) {
				arr[i][j]=count++;
			}
		}
		
		System.out.println("# 우삼각 행렬의 값 출력 #");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
