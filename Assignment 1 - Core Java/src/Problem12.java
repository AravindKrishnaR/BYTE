import java.util.Scanner;

public class Problem12 {
	
	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;

		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		if(isPrime(num))
			System.out.println("The number " + num + " is a PRIME NUMBER!");
		else
			System.out.println("The number " + num + " is a COMPOSITE NUMBER!");
		
		sc.close();
	}
}