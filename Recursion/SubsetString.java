package Recursion;

import java.util.ArrayList;

public class SubsetString {
	static ArrayList<String> list=new ArrayList<>();
	public static void abc(String a, int i,String out) {
		if(i==a.length()) {
			list.add(out);
			return;
		}
		String out2=out+a.charAt(i);
		abc(a,i+1,out);
		abc(a,i+1,out2);
	}
	public static ArrayList<String> abcd(String a, int i,String out,ArrayList<String> list2) {
		if(i==a.length()) {
			list2.add(out);
			return list2;
		}
		String out2=out+a.charAt(i);
		abcd(a,i+1,out,list2);
		abcd(a,i+1,out2,list2);
		return list2;
	}
	public static ArrayList<String> abcde(String a, int i,String out) {
		if(i==a.length()) {
			ArrayList<String> list3=new ArrayList<>();
			list3.add(out);
			return list3;
		}
		String out2=out+a.charAt(i);
		ArrayList<String> x=abcde(a,i+1,out);
		ArrayList<String> y=abcde(a,i+1,out2);
		x.addAll(y);
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		abc("abc",0,"");
		ArrayList<String> list2=new ArrayList<>();
		
		System.out.println(abcde("abc",0,""));
		System.out.println(abcd("abc",0,"",list2));

	}

}
