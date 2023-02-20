package Stringpack;

public class ToggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="coDiNg";
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length();i++) {
			char ch=sb.charAt(i);
			if(ch>='a' && ch<='z') {
				char a=(char) (ch-'a'+'A');
				sb.setCharAt(i, a);
			}
			else {
				char a=(char) (ch+'a'-'A');
				sb.setCharAt(i, a);
//
			}
		}
		System.out.println(sb);

	}

}
