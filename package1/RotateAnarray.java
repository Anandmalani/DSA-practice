package package1;

public class RotateAnarray {
	public static void reverse(int arr[],int l,int r) {
		int j=0;
		for(int i=l;i<=(r+l)/2;i++) {
			int temp=arr[i];
			arr[i]=arr[r-j];
			arr[r-j]=temp;
			j=j+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int k=2;
//		int j;
		reverse(arr,0,1);
		reverse(arr,2,3);

		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}



	}

}
