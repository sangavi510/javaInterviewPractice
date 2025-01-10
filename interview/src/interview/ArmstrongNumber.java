package interview;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		        int num = 203; // Number to check
		        int originalNum, remainder, result = 0;
		        int n = 0;
		        
		        // Assign num to originalNum
		        originalNum = num;
		        
		        // Find the number of digits in the given number
		        for (; originalNum != 0; originalNum /= 10, ++n);
		        
		        originalNum = num;
		        
		        // Calculate the sum of the nth power of each digit
		        while (originalNum != 0) {
		            remainder = originalNum % 10;
		            result += Math.pow(remainder, n);
		            originalNum /= 10;
		        }
		        
		        // Check if the sum equals the original number
		        if (result == num)
		            System.out.println(num + " is an Armstrong number.");
		        else
		            System.out.println(num + " is not an Armstrong number.");
		    }
		}



