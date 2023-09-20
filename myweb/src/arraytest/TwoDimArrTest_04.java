package arraytest;

public class TwoDimArrTest_04 {

	public static void main(String[] args) {
		
		int x[][]=
			{
					{3,1,5,1,5},
					{6,7,8,9,7},
					{1,2,3,4,8},
					{2,4,6,8,9}
			};
		
		System.out.println("### 4 X 5 행렬에서 각 행의 합 구하기 ###");
		
		int sum;
		
		for(int i=0;i<x.length;i++) {
			sum=0;
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+"\t");
				sum+=x[i][j];
			}
			System.out.println(": x["+i+"]번째 행의 합 = "+sum);
		}

	}

}
