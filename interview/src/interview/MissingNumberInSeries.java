package interview;

public class MissingNumberInSeries {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7,8,9,11};
		int n = arr.length + 1;

		// Calculate the sum of array elements
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += arr[i];
		}

		// Calculate the expected sum
		int expectedSum = (n * (n + 1)) / 2;



		System.out.println(expectedSum - sum);

	}
}


