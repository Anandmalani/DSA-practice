package Recursion;

import java.util.ArrayList;

public class Subsetquestion {
	public static void abc(String a, String b, int i) {
		if(i==a.length()) {
			System.out.println(b);
			return;
		}
		char c=a.charAt(i);
		abc(a,b+c,i+1);
		abc(a,b,i+1);
	}
	public static void abcd(String a, String b, int i,ArrayList<String> list) {
		if(i==a.length()) {
			list.add(b);
			return;
		}
		char c=a.charAt(i);
		abcd(a,b+c,i+1,list);
		abcd(a,b,i+1,list);
	}
	public static ArrayList<String> ab(String a, String b,ArrayList<String> list) {
		if(a.length()==0) {
			list.add(b);
			if(b.length()==1) {
				char x=b.charAt(0);
				String p=x+0+"";
				list.add(p);
			}
			return list;
		}
		char c=a.charAt(0);
		ab(a.substring(1),b,list);
//		ArrayList<String> list2 =
	   ab(a.substring(1),b+c,list);
//		list1.addAll(list2);
		return list;
	   
	}
	public static ArrayList<String> abb(String a, String b) {
		ArrayList<String> li=new ArrayList<>();
		if(a.length()==0) {
			li.add(b);
			return li;
		}
		char c=a.charAt(0);
		ArrayList<String> l1 = abb(a.substring(1),b);
//		ArrayList<String> list2 =
	   ArrayList<String> l2 = abb(a.substring(1),b+c);
		l1.addAll(l2);
		return l1;
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc("jwx","",0);
//		abcd("wsn","",0,);
		ArrayList<String> list=new ArrayList<String>();
		System.out.println(ab("dek","",list));
		System.out.println(abb("dek",""));
		
		

	}

}
