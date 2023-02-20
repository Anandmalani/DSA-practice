package Recursionfeb;

public class Sumof1ton {
	public static void abc(int n, int s) {
		if(n==0) {
			System.out.println(s);//55
			return;
		}
		s=s+n;
		abc(n-1,s);
		
	}
	public static int  ab(int n, int s) {
		if(n==0) {
//			System.out.println(s);//55
			return s;
		}
		s=s+n;
		return ab(n-1,s);
		
	}
	public static int  abcd(int n) {
		if(n==0) {
//			System.out.println(s);//55
			return 0;
		}
		
		int a=abcd(n-1);
		return a+n;
		
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		abc(10,s);
		System.out.println(abcd(10));
		System.out.println(ab(10,0));
		
		

	}

}
