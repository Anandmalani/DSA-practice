package Recursion;

public class sumofdigits {
	public static int abc(int n) {
		if(n/10==0) {
			return n;
		}
		int a=n%10;
		n=n/10;
		return abc(n)+a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abc(712371));

	}

}
