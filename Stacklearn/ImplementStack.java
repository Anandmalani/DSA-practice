package Stacklearn;

public class ImplementStack {
	 static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	 static class Stack{
		Node head;
		public void push(int data) {
			Node newnode=new Node(data);
			if(head==null) {
				head=newnode;
			}
			else {
				newnode.next=head;
				head=newnode;
			}
		}
		public int pop() {
			if(head==null) {
				return -1;
			}
			else {
				int top=head.data;
				head=head.next;
				return top;
			}
		}
		public int peek() {
			if(head==null) {
				return -1;
			}
			else {
				return head.data;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ImplementStack.Stack s2=new ImplementStack.Stack();
		Stack s1=new Stack();
		s1.push(20);
		s1.push(94);
		
		while(s1.head!=null) {
			System.out.println(s1.peek());
			s1.pop();
		}

	}

}
