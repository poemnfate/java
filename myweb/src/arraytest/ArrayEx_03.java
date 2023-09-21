package arraytest;

public class ArrayEx_03 {

	public static void main(String[] args) {
		
		int arr[]=new int[15];
		
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				arr[i]=count;
			}else if(i==1){
				arr[i]=count++;
			}else {
				arr[i]=arr[i-2]+arr[i-1];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+"번째의 피보나치수="+arr[i]);
		}

	}

}
