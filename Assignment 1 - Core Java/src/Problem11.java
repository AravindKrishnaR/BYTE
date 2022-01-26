import java.util.Scanner;

public class Problem11 {
	
	private static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i <= num; i++)
			fact *= i;
		
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int fact = factorial(num);
		System.out.println("The factorial of " + num + " is: " + fact);
		
		sc.close();
	}
}
