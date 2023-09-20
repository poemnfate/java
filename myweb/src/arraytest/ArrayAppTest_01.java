package arraytest;

public class ArrayAppTest_01 {

	public static void main(String[] args) {
		
		int x[][]= {
				{7,1,5,2,0,0},
				{6,7,8,9,0,0},
				{1,2,3,5,0,0},
				{6,2,8,9,0,0},
				{3,3,4,5,0,0}
		};
		
		System.out.println("### 5 X 6 행렬에서 각 행의 합 구하기 ###");
		
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length-2;j++) {
				x[i][4]+=x[i][j];
			}
		}
		System.out.println("=== 2차원 배열에서 각 행의 합을 계산한 결과를 출력 ===");
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length-1;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int i=0;i<x.length-1;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i][4]<x[j][4]) {
					int temp[]=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		System.out.println("=== 2차원 배열에서 각 행의 합을 기준으로 내림차순으로 정렬된 결과 출력 ===");
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length-1;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		int rank=1;
		
		for(int i=0;i<x.length;i++) {
			if(i==0) {
				x[i][5]=rank;
			}else {
				if(x[i][4]==x[i-1][4]) {
					x[i][5]=x[i-1][5];
				}else {
					x[i][5]=rank;
				}
			}
			rank++;
		}
		System.out.println("=== 2차원 배열에서 각 행의 합을 기준으로 순위가 부여된 결과 출력 ===");
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
