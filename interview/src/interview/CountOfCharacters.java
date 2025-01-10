package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CountOfCharacters {

	public static void main (String args[]) {
		
		
		String name1 ="Karpagame Saravanan";
		String name=name1.toUpperCase();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		char[] arr= name.toCharArray();
		for(char i : arr) {
			if(map.containsKey(i))
			map.put(i, map.get(i) +1);
			else
				map.put(i, map.getOrDefault(i,1));	
		}
		
		//sorting by key
		TreeMap<Character,Integer> tree = new TreeMap<>();
		tree.putAll(map);
		for(Entry<Character, Integer> entry : tree.entrySet()) {
		System.out.println(entry);
		}
		
		System.out.println("*****");
		//sorting by value
			

		
		
	}
}
