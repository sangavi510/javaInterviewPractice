package interview;


import java.util.Iterator;

import java.util.LinkedList;

public class iIterator {
	public static void main(String args[]) {
	
	LinkedList<String> map = new LinkedList<>();
	map.add("sangu");
	map.add("masha");
	map.add("anish");
	map.add("lakme");
	
	for(int i=0;i<map.size();i++) {
		System.out.println(map.get(i));
	}
	
	Iterator<String> it = map.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}	
	
	}
}
