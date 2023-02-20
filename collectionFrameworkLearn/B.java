package collectionFrameworkLearn;

//import ArrayListquestions.ClassA1;

public class B  {
	 public static int alternateDigitSum(int n) {
	        String str=Integer.toString(n);
	        int c=0;
	        for(int i=0;i<str.length();i=i+2){
	        	System.out.println(c);
		         
	            c=c+str.charAt(i)-'0';
	            System.out.println(c);
	            if(i+1<str.length()){
	                c=c-str.charAt(i+1)-'0';
	                System.out.println(c);
	            }
	        }
	        System.out.println(c);
	        return c;
	        
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alternateDigitSum(521);
		B a1=new B();
		
//		

	}

}
