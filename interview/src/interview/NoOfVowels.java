package interview;

import java.util.HashMap;
import java.util.Map.Entry;

public class NoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="In Java, String is the type of objects that can store the sequence of characters enclosed by double quotes and every character is stored in 16 bits i.e using UTF 16-bit encoding.";
		char[] ch =str.toCharArray();
		HashMap<Character,Integer>map = new HashMap<>();
		
		for(char i:ch) {
			if(map.containsKey(i)) 
				map.put(i, map.get(i)+1);
			else
				map.put(i, map.getOrDefault(i, 1));
				
			}
		
		System.out.println(map);
		
		for(Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getKey()==('a')||entry.getKey().equals('e')||entry.getKey().equals('i')||entry.getKey().equals('o')||entry.getKey().equals('u')) {
				System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}
	}

}
