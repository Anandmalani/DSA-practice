package tree;

public class BinaryTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public Node buildTree(int arr[],int i) {
		if(i>=arr.length) {
			return null;
		}
		if(arr[i]==-1) {
			return null;
		}
		Node n1=new Node(arr[i]);
		n1.left=buildTree(arr,i+1);
		n1.right=buildTree(arr,i+1);
		return n1;
	}
	public void printpreorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printpreorder(root.left);
		printpreorder(root.right) ;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,-1,-1,3,3,4};
		int i=0;
		BinaryTree b1=new BinaryTree();
		Node root=b1.buildTree(arr, 0);
		System.out.println(root.data);
//		System.out.println(b1.root.data);
		System.out.println(root.left.data);
		b1.printpreorder(root);


		

	}

}
