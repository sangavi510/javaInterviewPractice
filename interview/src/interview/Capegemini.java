package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class Capegemini {
    public static void main(String[] args) {
       HashMap<String,Integer> map= new HashMap<>();
       map.put("sangavi", 25);
       map.put("karpagame", 47);
       HashMap<String,Integer> map2= new HashMap<>();
       map2.put("sakthivel", 27);
       map2.put("karpagame", 45);
       
       
       for(Entry<String, Integer> entry : map2.entrySet()) {
    	  map.merge(entry.getKey(), entry.getValue(), Integer::sum);
       }
       
       
       System.out.println("map after merge" +map);
       
       
       String str = "hello world";
       HashMap<Character, Integer> charCountMap = new HashMap<>();

       // Count occurrences of each character
       for (char c : str.toCharArray()) {
           charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
       }

       // Print the character counts
       for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }
    }}
