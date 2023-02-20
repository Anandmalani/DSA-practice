package Recursion;

public class ReverseADigit {
	public static int abc(int n) {
		if(n/10==0) {
			return n;
		}
		int a=n%10;
		n=n/10;
		String x=Integer.toString(a)+abc(n);
		return Integer.parseInt(x);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(abc(712371));

	}

}
