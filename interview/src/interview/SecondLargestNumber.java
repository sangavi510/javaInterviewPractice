package interview;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
	int arr[] = {22,45,63,22,51,100,456,53,200,576};
	
	/*int temp =0;
	int count =0;
	for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	}*/
	System.out.println(Arrays.binarySearch(arr, 200));
	Arrays.sort(arr);
	System.out.println(arr[arr.length-2]);
	

	}

}
