package Stringpack;

public class AsciiDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="adefb";
//		String s=a.charAt(0)+"";
		StringBuilder sb=new StringBuilder(a.charAt(0)+"");
		for(int i=1;i<a.length();i++) {
			int q=a.charAt(i)-a.charAt(i-1);
			sb.append(q);
			sb.append(a.charAt(i));
		}
		System.out.println(sb.toString());

	}

}
