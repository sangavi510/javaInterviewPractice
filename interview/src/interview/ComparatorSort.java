package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ComparatorSort {

	public static void main(String[] args){
	Comparator<Integer> com = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			//compares last digits of the integers
			if(o1%10 > o2%10)
			return 1;
			else
				return -1;
		}
	};
	 List<Integer>l1=new ArrayList<>();
	l1.add(12);
	l1.add(21);
	l1.add(23);
	l1.add(57);
		Collections.sort(l1,com);
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

	}


