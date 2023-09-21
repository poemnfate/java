package arraytest;

public class ArrayEx_02 {

	public static void main(String[] args) {
		
		int arrA[][]=new int[3][4];
		int arrB[][]=new int[3][4];
		int arrC[][]=new int[3][4];
		
		int count=1;
		
		for(int i=0;i<arrC.length;i++) {
			for(int j=0;j<arrC[i].length;j++) {
				arrA[i][j]=count;
				arrB[i][j]=count;
				
				arrC[i][j]=arrA[i][j]+arrB[i][j];
				count++;
			}
		}
		
		for(int i=0;i<arrC.length;i++) {
			for(int j=0;j<arrC[i].length;j++) {
				System.out.print("c["+i+","+j+"]="+arrC[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
