package linkedlist;


// * Definition for singly-linked list.
 class ListNode {
      int val;
     ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class aaa {
    public ListNode abc(ListNode head,int a){
        ListNode x=head;
        ListNode y=head;
        while(a!=0){
            x=x.next;
            a--;
        }
        while(y!=x){
            x=x.next;
            y=y.next;
        }
        return x;

    }
    public int calculateLength(ListNode s,ListNode f){
          int c=1;
           while(s!=f){
               c=c+1;
               f=f.next;
           }
                System.out.println(c);
           return c;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head;
        while (f!=null && f.next!=null){
            if(s==f){
                int a=calculateLength(s,f.next);
                System.out.println(a);
                // return abc(head,a);
            }
            s=s.next;
            f=f.next.next;
        }
        return null;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	

	}
}