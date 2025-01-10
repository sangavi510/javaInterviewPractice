package interview;

import java.io.InputStream;
import java.util.Scanner;

public class First_n_factorial {

	public static void main(String[] args) {
		
		
		int n = 10;
		
		long arr[] = printFibb(n);
		
		for(long l : arr) {
			System.out.println(l);
		}
	}
		public static long[] printFibb(int n) 
	    {
	        //Your code here
	        long [] arr = new long[n];
	        long sum=0;
	        long temp=1;
	        arr[0]=1;
	        arr[1]=1;
	       
	        
	        for(int i=2;i<n;i++){
	    
	            
	            arr[i]=arr[i-1]+arr[i-2];
	            
	        }
	        
	        
	        return arr;
	        
	       
	

}
}
