package RecursionPractice;

import java.util.ArrayList;

public class LinearSearch {
	public static ArrayList abc(int arr[],ArrayList<Integer> list,int target,int i ) {
		if(i==arr.length){
			return list;
		}
		if(arr[i]==target) {
			list.add(i);
		}
		return abc(arr,list,target,i+1);
	}
	public static ArrayList ab(int arr[],int target,int i ) {
		ArrayList<Integer> list2=new ArrayList<>();
		if(i==arr.length){
			return list2;
		}
		if(arr[i]==target) {
			list2.add(i);
		}
		ArrayList l1 = ab(arr,target,i+1);
		list2.addAll(l1);
		return list2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> list=new ArrayList<>();
        
		int arr[]= {1,2,1};
//		abc(arr,list,1,0);
		System.out.println(abc(arr,list,1,0));
		
//		ist,1,0);
		System.out.println(ab(arr,1,0));
	}

}
