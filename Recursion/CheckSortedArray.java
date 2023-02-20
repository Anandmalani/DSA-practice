package Recursion;

public class CheckSortedArray {
	public static boolean abc(int arr[],int i) {
		if(i==arr.length-1) {
			return true;
		}
		return abc(arr,i+1) && arr[i]>arr[i+1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,3};
		System.out.println(abc(arr,0));

	}

}
