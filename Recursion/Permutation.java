package Recursion;

import java.util.ArrayList;

public class Permutation {
	public static void abc(String a, String b) {
		if(a.length()==0) {
			System.out.println(b);
			return ;
		}
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			String a1=a.substring(0,i)+a.substring(i+1);
			abc(a1,b+c);
		}
	}
	public static void abcd(String a, String b,ArrayList<String> list) {
		if(a.length()==0) {
			list.add(b);
			return ;
		}
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			String a1=a.substring(0,i)+a.substring(i+1);
			abcd(a1,b+c,list);
		}
	}
	public static ArrayList  ab(String a, String b,ArrayList<String> list1) {
		if(a.length()==0) {
			list1.add(b);
			return list1 ;
		}
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			String a1=a.substring(0,i)+a.substring(i+1);
			ab(a1,b+c,list1);
			
		}
		return list1;
	}
	public static ArrayList  abb(String a, String b) {
		ArrayList<String> list1=new ArrayList<>();
		if(a.length()==0) {
			list1.add(b);
			return list1 ;
		}
		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			String a1=a.substring(0,i)+a.substring(i+1);
			ArrayList l1 = abb(a1,b+c);
		    list1.addAll(l1);
//		    return list1;
		    
			
		}
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc("abc","");
		ArrayList<String> list=new ArrayList<>();
//		abcd("abc","",list);
//		System.out.println(list);
		System.out.println(abb("djs",""));
		

	}

}
