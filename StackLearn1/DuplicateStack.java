package StackLearn1;

import java.util.*;


public class DuplicateStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    String str = sc.nextLine();
		    Stack<Character> st = new Stack<>();
		    for (int i = 0; i < str.length(); i++) {
		        if(str.charAt(i)==')'){
		            if(st.peek()=='('){
		                System.out.println("true");
		                return;
		                
		            }
		            else {
		             while(st.peek()!='('){
		                st.pop();
		             }
		             st.pop();
		            }
		        }
		        else{
		            st.push(str.charAt(i));
		        }

		      
		    }
		    System.out.println("false");

		  }

		

	}


