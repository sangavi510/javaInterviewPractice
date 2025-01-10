package interview;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class MergeArrays {

	public static void main (String azrgs[]) {
		int arr1[] = {11,33,42,55,60,72,100,1234,345,23};
		int arr2[] = {22,12,55,60,8,9,0};
		 TreeSet<Integer> l= new TreeSet<>();
		
		 for(int i : arr1) {
			 l.add(i);
		 }
		 for(int i : arr2) {
			 l.add(i);
		 }
		 
		 
		 System.out.println(l);
		
		 
		 }
		
	}

