package StackLearn1;

class Stack1{
	 class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head;
	public void push(int data) {
		Node n1=new Node(data);
		if(head ==null) {
			head=n1;
			
		}
		else {
			n1.next=head;
			head=n1;
		}
	}
	public int pop() {
		if(head==null) {
			return -1;
		}
		int a=head.data;
		head=head.next;
		return a;
		
	}
	public int peek() {
//		return arr.remove(arr.size()-1);
		if(head==null) {
			return -1;
		}
		int a=head.data;
//		head=head.next;
		return a;
	}

}
public class ImplementationFronLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack1 s1=new Stack1();
		s1.push(30);
		s1.push(40);
		while(s1.head!=null) {
			System.out.println(s1.pop());
		}

	}

}
