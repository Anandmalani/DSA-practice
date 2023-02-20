package Recursion;

import java.util.ArrayList;

public class linearSearch {
	public static boolean abc(int arr[],int i,int target) {
		if(i==arr.length) {
			return false;
		}
		return abc(arr,i+1,target) || arr[i]==target;
	}
//	public static int abcd(int arr[],int i,int target,int c) {
//		if(i==arr.length) {
//			return 0;
//		}
//		if(arr[i]==target) {
//			c=c+1;
//		}
//		abcd(arr,i+1,target,c);
//		return c;
//	}
	public static int ab(int arr[],int i,int target) {
		if(i==arr.length) {
			return 0;
		}
		if(arr[i]==target) {
			return 1+ ab(arr,i+1,target);

		}
		
		return ab(arr,i+1,target);
		
	}
	static ArrayList<Integer> list=new ArrayList<>();
	public static void abd(int arr[],int i,int target) {
		if(i==arr.length) {
			return ;
		}
		if(arr[i]==target) {
			list.add(i);
			abd(arr,i+1,target);

		}
		else {
		
		abd(arr,i+1,target);
		}
	}
//	static ArrayList<Integer> list2=new ArrayList<>();
//	public static void abd(int arr[],int i,int target) {
	
	public static ArrayList abdee(int arr[],int i,int target,ArrayList<Integer> list2) {
		if(i==arr.length) {
			return list2;
		}
		if(arr[i]==target) {
			list2.add(i);
			return abdee(arr,i+1,target,list2);

		}
		else {
		return abdee(arr,i+1,target,list2);
		}
	}
	public static ArrayList<Integer> abde(int arr[],int i,int target) {
		ArrayList<Integer> list=new ArrayList<>();
		if(i==arr.length) {
			return list;
		}
		if(arr[i]==target) {
			list.add(i);
					}
		
		ArrayList<Integer> x = abde(arr,i+1,target);
		list.addAll(x);
		return list;
		
	}
	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,3};
		System.out.println(abc(arr,0,4));
//		int[] arr2= {1,1};
//		System.out.println(abcd(arr2,0,1,0));
		int[] arr3= {1,1};
		ArrayList<Integer> list2=new ArrayList<>();
		System.out.println(abdee(arr3,0,1,list2));
//		abd(arr3,0,1);
//		System.out.println(list);





	}

}
