package Recursion;

public class BinarySearch {
	static int arr[]= {1,3,5,8,90};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]= {1,3,5,8,90};
		
		System.out.println(bs(0,4,8));

	}
	public static int bs(int s, int e,int t) {
		if(s>e) {
			return -1;
		}
		int m=s+(e-s)/2;
		if(arr[m]==t) {
			return m;
		}
		else if(arr[m]>t){
			return bs(s,m-1,t);
			
			
		}
		else {
			return bs(m+1,e,t);
		}
	}

}
