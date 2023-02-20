package package1;

import java.util.Scanner;

public class Permutation {
	public static int factorial(int a) {
		if(a==0) {
			return 1;
		}
		int f=1;
		for(int i=1;i<=a;i++) {
			f=f*i;
			
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//permutation---------Arrangement
		//combination---------Selection
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		System.out.println("hello");
		System.out.println(factorial(n)/factorial(n-r));
		

	}

}

//concept
//why we used function factorial here?
// ans: do  not repeat yourself, it will take extra space and ,
//let say you will make same mistake while using for loop, so it will
//difficult to make all for loops right