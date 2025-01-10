package interview;

import java.util.HashMap;
import java.util.Map.Entry;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "My Name Is Sangavi Saravanan";
		HashMap<Character,Integer> map = new HashMap<>();
		char[]ch = str.toCharArray();
		for(char i : ch) {
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}
		
		for(Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
				System.out.println("This Character "+entry.getKey()+" repeats "+entry.getValue()+" times");
		}
	}

}
