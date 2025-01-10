package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class UppercaseConvert {

	public static void main(String[] args) {
		/*11. Write a program to find the largest and smallest elements in an array.
		12. Implement a program to find the second largest number in an array.
		13. Write a program to remove duplicates from an array.
		14. Write a program to sort an array in ascending order.
		15. Implement a program to merge two arrays into one.
		16. Write a program to find the missing number in an array of integers from 1 to n.
		17. Write a program to count the occurrences of each element in an array.
		18. Implement a program to rotate an array to the left by a given number of positions.
		19. Write a program to find the sum of all elements in an array.
		20. Write a program to find all pairs of numbers in an array that add up to a given sum.*/
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10,3,2,4,39};
		TreeSet<Integer>tree = new TreeSet<>();
		for(int i=0;i<arr.length;i++) {
			tree.add(arr[i]);
		}
		System.out.println("Smallest number in the array" +tree.first());
		System.out.println("Largest number in the array" +tree.last());
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
		Integer ar1[] = {1,3,5,7,8};
		Integer ar2[] = {2,4,5,6,7};
		
		 List<Integer> list1 =new ArrayList<>(Arrays.asList(ar1));
	        List<Integer> list2 = Arrays.asList(ar2);
	        list1.addAll(list2);
		
		System.out.println(list1);
		
		int num=5;
		System.out.println(num%10);
		System.out.println(num/10);
		
		
		



		

	}
}

