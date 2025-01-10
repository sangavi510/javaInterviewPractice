package interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
public class RemoveDuplicatesInString {
	public static void main(String args[]) {
		/*{
		
 String str ="SubString";
 char[] ch = str.toCharArray();
 LinkedHashSet<Character> set = new LinkedHashSet<>();   
 //Add each character of the string into LinkedHashSet   
 for(int i=0;i<ch.length;i++)   
     set.add(ch[i]);   
   
 
 System.out.print( set.toString());
 set.toString();
 // print the string after removing duplicate characters   
 for(Character ch1 : set)   
     System.out.print(ch1);
return ;
	}
	}
	public void printDuplicatesInString() {*/
		 String value = "This is testing Program testing Program";

	        String item[] = value.split(" ");

	        HashMap<String, Integer> map = new HashMap<>();

	        for (String t : item) {
	            if (map.containsKey(t)) {
	                map.put(t, map.get(t) + 1);

	            } else {
	                map.put(t, 1);
	            }
	        }
	        Set<String> keys = map.keySet();
	        for (String key : keys) {
	            System.out.println(key);
	           // System.out.println(map.get(key));
	        }
		
		
	}
}
/*public void removeDuplicateIntegers() {
	int arr[]= {1,2,3,1,4,5,4,6,7,6,5,4,3};
	HashSet<Integer> set = new HashSet<>();
	for(int i:arr) {
	set.add(i);

	}
	System.out.println(set);
}
	
}*/
