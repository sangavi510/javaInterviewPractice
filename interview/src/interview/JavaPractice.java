package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class JavaPractice {
	
	public static int factorial(int num) {
		if(num==0)
			return 1;
		else
			return(num*factorial(num-1));
	}

	public static void main(String[] args) {
		/*
		 *  Swap Two Numbers
49:55 - Reverse an Integer
1:28:53 - Factorial Of a Number
1:37:35- Length of Last Word in String
1:55:58 - Print Even Word From a String
2:27:34 - Missing Number in Array
3:01:08 - Find the Sum of Array
3:19:32 - Find the 2nd Largest Number in Array
3:37:20 - Move All Zeros to the End
3:55:33 - Count Frequency of Characters in String
		 */
		
		//using temp variable
		System.out.println("1a).using temp variable");
		int a=10,b=20;
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		
		System.out.println(a+ " "+b);
		
		//without third variable
		System.out.println("1b).without third variable");
		int c=25,d=50;
		c=c+d;
		d=c-d;
		c=c-d;
		
		System.err.println(c+" "+d);
		
		//reverse an integer
		System.out.println("2).reverse an integer");
		int num=759;
		int div,rem,rev=0;
		
		while(num!=0) {
			rev=rev*10+(num%10);
			num/=10;
		}
		
		System.out.println(rev);
		
		//factorial of a number
		System.out.println("3a).factorial of a number using for loop");
		
		int n=4;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		
		System.out.println(fact);
		
		//factorial of a number
		System.out.println("3a).factorial of a number using recursion function");
		
		int number=5;
		System.out.println(factorial(number));

		//Length of the last word in a string
		System.out.println("4).Length of the last word in a string");
				
		String sent="one two a four five fifteen";
		String arr[]=sent.split(" ");
		int noOfWords = arr.length;
		int lastWordLength = arr[noOfWords-1].length();
		
		System.out.println(lastWordLength);
		
		//Print Even Word From a String
		System.out.println("5).Print Even Word From a String");
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()%2==0)
				System.out.println(arr[i]+ " ");
		}
		
		//Missing Number in Array
		System.out.println("6). Missing Number in Array");
		
		int array[] = {5,7,19,10,12};
		List<Integer> list = new ArrayList<>();
		int current,next;
		for(int i=0;i<array.length-1;i++) {
			current=array[i];
			next=array[i+1];
			for(int j=current+1;j<next;j++) {
				list.add(j);
			}
		}
		
		System.out.println(list);
		
		//Find the Sum of Array
		
		System.out.println("7). Find the Sum of Array");
		
		int sum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		System.out.println(sum);
		
		//Find the 2nd Largest Number in Array
		System.out.println("8a). Find the 2nd Largest Number in Array using collections");
		
		Arrays.sort(array);
		System.out.println(array[array.length-2]);
		
		System.out.println("8b). Find the 2nd Largest Number in Array without collections");
		int largest=0,secondLargest=0;
		
		
		int arr1[]= {100,12,50,12,3,67};
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>largest) {
				secondLargest=largest;
				largest=arr1[i];
				}
			
			else if(arr1[i]>secondLargest && arr1[i]!=largest)
				secondLargest=arr1[i];
			}
		
		System.out.println(secondLargest);
		
		//Move All Zeros to the End
		System.out.println("9a). Move All Zeros to the End by arrays.sort built in function");
		int s[]= {1,4,0,7,0,3,0,9};
		
		Arrays.sort(s);
		
			for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
			
			System.out.println("9b). Move All Zeros to the End by sorting");
			int s1[]= {1,4,0,7,3};
			int index=0;
			
			for(int i=0;i<s1.length;i++) {
				if(s1[i]!=0) {
					s1[index]=s1[i];
					index++;}
			}
			
			while(index<s1.length) {
				s1[index]=0;
				index++;
			}
			
			for(int i=0;i<s1.length;i++) {
				System.out.println(s1[i]);
			}
			
		//Count Frequency of Characters in String
		System.out.println("10). Count Frequency of Characters in String");
		
		String test="Saravanan";
		char ch[]=test.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(char t:ch) {
			if(map.containsKey(t))
				map.put(t, map.get(t)+1);
			else
				map.put(t, map.getOrDefault(t, 1));
		}
		
		for(Entry<Character,Integer>entry : map.entrySet()) {
		System.out.println(entry.getKey()+ " : "+ entry.getValue());
		
	}
	}

}
