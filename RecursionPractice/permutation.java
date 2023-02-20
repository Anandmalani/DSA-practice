package RecursionPractice;

public class permutation {
	public static void abc(String a,String b) {
		if(a.length()==0) {
			System.out.println(b);
		}
		
		for(int i=0;i<a.length();i++) {
			char x = a.charAt(i);
			String newString=a.substring(0, i)+a.substring(i+1);
			abc(newString,b+x);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		abc("abc","");
		

	}

}
