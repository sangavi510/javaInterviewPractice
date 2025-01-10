package interview;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
	
		// code here
		int n=18468;
		String s1 = Integer.toString(n);
		System.out.println(s1);
		char arr[] = s1.toCharArray();
		
		int flag =0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j==i+1;j++) {
			if(arr[i]<arr[j]) {
				flag=1;
				System.out.println(flag);
			}
			else
			{flag=0;
			System.out.println(flag);
			break;}
		}
		}
	


	}

}
