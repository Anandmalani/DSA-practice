package StackLearn1;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st=new Stack<>();
	      HashMap<Character,Character> hm=new HashMap<>();
	        hm.put('(',')');
	        hm.put('[',']');
	        hm.put('{','}');
	        String str="(wwe";
	        for(int i=0;i<str.length();i++) {
	        	if(hm.containsKey(str.charAt(i))) {
	        		st.push(str.charAt(i));
	        	}
	        	else if(hm.containsValue(str.charAt(i))) {
	        		if(st.isEmpty()) {
	        			System.out.println("false");
	        			return;
	        		}
	        		else if(hm.get(st.peek())==str.charAt(i)) {
	        			st.pop();
	        		}
	        		else {
	        			System.out.println("false");
	        			return;
	        		}
	        		
	        		
	        	}
	        }
	        if(st.isEmpty()) {
	        	System.out.println("true");
//				return;

	        }
	        else {
	        	System.out.println("false");
//				return;
		        

	        }
//	        System.out.println("true");
//			return;
	        
	       	}
	
	

}
