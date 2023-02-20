package collectionFrameworkLearn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		ArrayList<Integer> b1=new ArrayList<Integer>();
		b1.add(13);
	    b1.add(14);
		a1.add(34);
		a1.add(9);
		a1.add(107);
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		for(Integer i:a1) {
			System.out.println(i);
		}
		Iterator<Integer> itr=a1.iterator();
		//34,9,107
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		
			
		
	}

}
