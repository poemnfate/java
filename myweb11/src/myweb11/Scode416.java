package myweb11;

public class Scode416 {
	
	public void printArr(String[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(arr[i]+", ");
			}
		}
		
		System.out.print("]");
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 * 아마존 면접 문제
		 * 
		 * 다음과 같은 형태의 배열을 [a1,a2,a3...,an,b1,b2...bn]

		   다음과 같은 형태로 바꾸시오 [a1,b1,a2,b2.....an,bn]
		 * 
		 * */
		
		 String[] arr = new String[] {"a1", "a2", "a3", "a4", "a5", "a6",
				 "b1", "b2", "b3", "b4", "b5","b6"};
		 Scode416 s=new Scode416();
		 
		s.printArr(arr);
		 for(int i=0;i<arr.length/2;i=i+2) {
			 for(int j=i;j<arr.length;j++) {
				
				 if(arr[i].substring(1).equals(arr[j].substring(1))) {
					 System.out.println(arr[i].substring(1)+"/"+arr[j].substring(1));
					 String temp=arr[i+1];
					 arr[i+1]=arr[j];
					 arr[j]=temp;
					 if(arr[i].charAt(0)>arr[i+1].charAt(0)) {
						 temp=arr[i];
						 arr[i]=arr[i+1];
						 arr[i+1]=temp;
					 }
				 }
			 }
		 }
		 s.printArr(arr);
	}

}
