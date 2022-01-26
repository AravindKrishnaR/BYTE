import java.util.Scanner;

public class Problem13 {

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i < n; i++)
			if (n % i == 0)
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

		printPrimeNums(num);

		sc.close();
	}
}