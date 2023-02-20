package Recursion;

public class StringremoveALLA {
	public static String abc(String a, int i) {
		String b="";
		if(i==a.length()) {
			return b;
		}
		if(a.charAt(i)!='a') {
			b=b+a.charAt(i);
		}
		String c = abc(a,i+1);
		return b+c;
		
	}
	public static String abcd(String a, String b,int i) {
		if(i==a.length()) {
			return b;
		}
		if(a.charAt(i)!='a') {
			b=b+a.charAt(i);
		}
		return abcd(a,b,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abc("absdassaa",0));
		System.out.println(abcd("absdassaa","",0));

	}

}
