package package1;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		while(a!=0) {
			int x=a%10;
			if(x==b) {
				c=c+1;
			}
			a=a/10;
		}
		
		System.out.println(c);		

	}

}
