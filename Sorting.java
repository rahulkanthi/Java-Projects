package com;

public class Sorting {

	private static int[] sortArray(int arr[]) {
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;

	}
	public static void main(String[] args) {
		
		int[] a={4,2,1,8,7,6};
		
		int[] res=sortArray(a);
		
		for(int i=0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
		
		
	}
}
