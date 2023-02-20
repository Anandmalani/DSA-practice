package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Subsetarraycode {
	static ArrayList<ArrayList> list=new ArrayList<>();
	public static void abc(int arr[],int i,ArrayList<Integer> out) {
		if(i==arr.length) {
			list.add(out);
			return;
		}
//		ArrayList<Integer>  out1=out;
//		ArrayList<Integer>  out2=new ArrayList<Integer>;
		
		abc(arr,i+1,new ArrayList<>(out));
		out.add(arr[i]);
		
		abc(arr,i+1,new ArrayList<>(out));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3};
//		list.addAll(arr);
		ArrayList<Integer> out=new ArrayList<>();

		
		abc(arr,0,out);
		System.out.println(list);

	}

}
