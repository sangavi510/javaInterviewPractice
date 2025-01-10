package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>(Arrays.asList("sangavi","sambuyu"));
		list.add("Arjun");
		list.add("Sapna");
		list.add("Samyukth");
		list.add("Gayathri");
		list.add("Lakmshrishree");
		Comparator<String>comp = (name1,name2)->(name1.length()<name2.length())?1:-1;
		Collections.sort(list,comp);
		
		System.out.println(list);
		

	}

}
