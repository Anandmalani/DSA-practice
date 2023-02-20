package Stringpack;

public class printallPalindromeSubstrings {
	public static boolean checkPalindrome(String a) {
		for(int i=0;i<a.length()/2;i++) {
			if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abccbc";
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<=s.length();j++) {
				String a=s.substring(i,j);
				if(checkPalindrome(a)==true) {
					System.out.println(a);
				}
			}
		}

	}

}
