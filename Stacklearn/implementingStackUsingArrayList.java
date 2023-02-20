package Stacklearn;

import java.util.ArrayList;

public class implementingStackUsingArrayList {
	static class Stack{
		ArrayList<Integer> list=new ArrayList<>();
		
		public boolean isEmpty() {
			if(list.size()==0) {
				return true;
			}
			return false;
		}
		
		public void push(int data) {
			list.add(data);
		}
		public int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
//			list.remove(list.size()-1);
//			return top;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
		s1.push(20);
		s1.push(40);
		while(!s1.isEmpty()) {
			System.out.println(s1.peek());
			s1.pop();
		}


	}

}
