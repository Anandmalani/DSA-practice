package linkedlist;

import linkedlist.LL.Node;

//import linkedlist.LL.Node;

class LL{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public  void addItemfirst(int data) {
		Node n1=new Node(data);
		if(head==null) {
			head=n1;
		}
		else {
			n1.next=head;
			head=n1;
		}
	}
	public void printData() {
		Node node=head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
//	public void abc(int i, int data) {
//		head=insertUsingre(i,data,head);
//		return;
//	}
	public Node insertUsingre(int i,int data,Node head) {
		if(head==null) {
			Node n1=new Node(data);
			head=n1;
			return head;
		}
		if(i==0) {
			Node n1=new Node(data);
			n1.next=head;
//			return n1;
			head=n1;
			return head;
		}
		Node a=insertUsingre(i--,data,head.next);
		head.next=a;
		return head;
	}
//	public Node insertUsingre(int i,int data,Node node) {}
	
	public void insertUsingr(int i,int k,int data,Node head) {
		if(head==null) {
			Node n1=new Node(data);
			head=n1;
			return ;
		}
		if(k+1==i) {
			Node n1=new Node(data);
			Node temp=head.next;
			head.next=n1;
			n1.next=temp;
			return ;
//			head=n1;
		}
		insertUsingr(i,k+1,data,head.next);
		
		return ;
	}
	
	
	
}

public class LinkedListImplementation {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL l1=new LL();
//		Node head;
		l1.addItemfirst(20);
		l1.addItemfirst(30);
	    l1.addItemfirst(40);
		
//		Node head;
//	    l1.printData();
//		Node a=l1.insertUsingre(1, 50,l1.head);
//	    l1.abc(1,66);
	    l1.insertUsingre(2, 78, l1.head);
		
		l1.printData();

	}

}
