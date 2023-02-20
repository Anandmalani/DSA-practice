package Stacklearn;

import java.util.Stack;

public class StackusingCollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1=new Stack<>();
		s1.push(20);
		s1.push(40);
		while(!s1.empty()) {
			System.out.println(s1.peek());
			s1.pop();
		}

	}

}
