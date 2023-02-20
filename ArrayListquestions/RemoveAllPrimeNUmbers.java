package ArrayListquestions;

import java.util.ArrayList;

public class RemoveAllPrimeNUmbers {
	public static boolean prime(int num) {
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(89);
		list.add(19);
		list.add(35);
		System.out.println(list);
		for(int i=list.size()-1;i>=0;i--) {
			if(prime(list.get(i))==true) {
				list.remove(i);
			}
		}
		System.out.println(list);


	}

}
