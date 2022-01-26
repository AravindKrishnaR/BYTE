import java.util.Scanner;

public class Problem13 {

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;

		for (int i = 2; i < num; i++)
			if (num % i == 0)
				return false;

		return true;
	}

	private static void printPrimeNums(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("\nPrime numbers between 2 and " + num + ": ");
		printPrimeNums(num);

		sc.close();
	}
}