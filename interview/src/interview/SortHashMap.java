package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMap {
		    public static void main(String[] args) {
		        // Create a sample HashMap
		        HashMap<String, Integer> originalMap = new HashMap<>();
		        originalMap.put("Apple", 50);
		        originalMap.put("Banana", 30);
		        originalMap.put("Orange", 70);
		        originalMap.put("Grapes", 40);
		        
		        // Sort the HashMap by values in ascending order
		        HashMap<String, Integer> ascendingMap = sortByValueAscending(originalMap);
		        System.out.println("Sorted in Ascending Order:");
		        for (Map.Entry<String, Integer> entry : ascendingMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }

		        // Sort the HashMap by values in descending order
		        HashMap<String, Integer> descendingMap = sortByValueDescending(originalMap);
		        System.out.println("\nSorted in Descending Order:");
		        for (Map.Entry<String, Integer> entry : descendingMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }

		    // Method to sort HashMap by values in ascending order
		    public static HashMap<String, Integer> sortByValueAscending(HashMap<String, Integer> map) {
		        // Create a list from the elements of the map
		        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		        // Sort the list by value using a lambda expression
		        list.sort(Map.Entry.comparingByValue());

		        // Create a new LinkedHashMap to preserve the insertion order
		        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		        for (Map.Entry<String, Integer> entry : list) {
		            sortedMap.put(entry.getKey(), entry.getValue());
		        }

		        return sortedMap;
		    }

		    // Method to sort HashMap by values in descending order
		    public static HashMap<String, Integer> sortByValueDescending(HashMap<String, Integer> map) {
		        // Create a list from the elements of the map
		        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		        // Sort the list by value in descending order using a lambda expression
		        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

		        // Create a new LinkedHashMap to preserve the insertion order
		        HashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		        for (Map.Entry<String, Integer> entry : list) {
		            sortedMap.put(entry.getKey(), entry.getValue());
		        }

		        return sortedMap;
		    }
		

		
		
	}


