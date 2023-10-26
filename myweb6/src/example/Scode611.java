package example;

public class Scode611 {
	
	public void printCenter(int arr[]) {
		if(arr.length%2==0) { // 자료의 갯수가 짝수
			int center=arr.length/2;
			int centerHap=(arr[center-1]+arr[center])/2;
			System.out.print("[");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print("]");
			System.out.print(" = "+centerHap);
			System.out.println();
			
		}else { // 자료의 갯수가 홀수
			int center=arr.length/2;
			System.out.print("[");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print("]");
			System.out.print(" = "+arr[center]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scode611 s=new Scode611();
		
		int arr1[] = {7, 9, 14};
        int arr2[]={24, 31, 35, 49};
        int arr3[]={17, 37, 37, 47, 57};
        int arr4[]={17, 37, 37, 47, 57,22};
        
        int twoArr[][]= {arr1,arr2,arr3,arr4};
        
        for(int i=0;i<twoArr.length;i++) {
        	s.printCenter(twoArr[i]);
        }

	}

}
