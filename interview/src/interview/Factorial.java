package interview;

public class Factorial {
	
	
public static int factorial(int number) {
	if(number==0)
		return 1;
	else
	return (number*factorial(number-1));
}
	
	
	public static void main(String[] args) {

int num=5;
int fact ;
fact= factorial(num);

System.out.println("Factorial of the number "+num+ "is"+  fact);
	}
}


