package arraytest;

public class TwoDimArrTest_01 {

	public static void main(String[] args) {
		
		int twoDimArr[][]=new int[3][4];
		int count=1;
		
		for(int i=0;i<twoDimArr.length;i++) { //twoDimArr.length <- 행의 갯수 반환
			for(int j=0;j<twoDimArr[i].length;j++) {
				twoDimArr[i][j]=count++;
			}
		}
		System.out.println("\t@@@2차원 배열의 값 출력@@@\n");
		
		for(int i=0;i<twoDimArr.length;i++) {
			for(int j=0;j<twoDimArr[i].length;j++) {
				System.out.print(twoDimArr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
