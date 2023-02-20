package stacklearning;

//import Stacklearn.ImplementStack.Node;

public class stack {
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
}


