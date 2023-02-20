package StringLevel0;

import java.util.Scanner;

public class AsciiDiffProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		StringBuilder sb=new StringBuilder(a.charAt(0)+"");
		
		//abcd
		
		//a1b1c  1d
		for(int i=1;i<a.length();i++) {
			int w=a.charAt(i)-a.charAt(i-1);
			sb.append(w);
			sb.append(a.charAt(i));
			
		}
		System.out.println(sb);
		

	}

}
