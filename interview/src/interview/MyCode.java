package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MyCode {

		    public static void main(String[] args) {
		        HashMap<String, Integer> map = new HashMap<>();
		        map.put("Sachin", 49);
		        map.put("Kohli", 50);
		        map.put("Rohit", 48);
		        map.put("Shubman", 37);

		        // Sort by values in ascending order
		        Map<String, Integer> ascendingMap = sortByValue(map, true);
		        System.out.println("Ascending Order: " + ascendingMap);

		        // Sort by values in descending order
		        Map<String, Integer> descendingMap = sortByValue(map, false);
		        System.out.println("Descending Order: " + descendingMap);
		    }

		    public static Map<String, Integer> sortByValue(HashMap<String, Integer> map, boolean ascending) {
		        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		        list.sort(Map.Entry.comparingByValue());
		        
		        if (!ascending) {
		            Collections.reverse(list);
		        }
		        
		        Map<String, Integer> sortedMap = new LinkedHashMap<>();
		        for (Map.Entry<String, Integer> entry : list) {
		            sortedMap.put(entry.getKey(), entry.getValue());
		        }
		        return sortedMap;
		    }
		}



