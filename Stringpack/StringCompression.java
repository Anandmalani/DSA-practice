package Stringpack;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aabbccdeffg";
		String b=a.charAt(0)+"";
		int c=1;
		for(int i=1;i<a.length();i++){
			if(a.charAt(i)==a.charAt(i-1)) {
				c=c+1;
			}
			else {
				if(c>1) {
					b=b+c+a.charAt(i);
					c=1;
				}
				else {
					b=b+a.charAt(i);
				}
				
			}
		}
		if(c>1) {
			b=b+c;
			
		}
		System.out.println(b);
		

	}

}
