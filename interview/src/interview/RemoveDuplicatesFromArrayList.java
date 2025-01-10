package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ArrayList<String> arr =new ArrayList<>();
		arr.add("sangu");
		arr.add("samyu");
		arr.add("s");
		arr.add("sa");
		arr.add("karpagame");
		
		HashSet<String>set = new HashSet<>(arr);
		arr= new ArrayList<>(set);
		System.out.println(arr);
		
		String name="Saravanan";
		StringBuffer sb = new StringBuffer();
		char[] ch = name.toCharArray();
		HashSet<Character>set1 = new HashSet<>();
		for(int i=0;i<ch.length;i++) {
		set1.add(ch[i]);
		}
		for(char j:set1) {
			sb.append(j);
			}
		System.out.println(sb.toString());
		
		List<String>l1= arr.stream()
				.filter(n->n.length()>2)
				.map(n->n)
				.collect(Collectors.toList());
		
		System.out.println(l1);*/
		 
		/* int[] arr = {1,2,9,4,6,10};
		 int largest=Integer.MIN_VALUE,secondLargest=Integer.MIN_VALUE;
		
		   for(int i=0;i<arr.length;i++){
		     if(arr[i]>largest)
		     { 
		    	 secondLargest=largest;
		    	 largest=arr[i];
		     }
		     		
		     else if(arr[i]>secondLargest && arr[i]!=largest)
		    	 secondLargest=arr[i];
		      
		     }
		   
		   System.out.println(secondLargest);*/
		int[] arr = {1,2,5,3,4,5,6,7};
		   int target=5;
		   int first=0 , last=0;
		  
		   for(int i=0;i<arr.length-1;i++) {
			   if(arr[i]==target)
			   { first=i;
			   break;}
		   }
		for(int j=arr.length-1;j>0;j--) {
			if(arr[j]==target)
			   { last=j;
			   break;} 
			   }
			   
		
		   System.out.println(first +" " + last);
	}
}
	
	
		
	


