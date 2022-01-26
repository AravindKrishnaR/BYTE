import java.util.Scanner;

public class Problem08 {
	
	private static void pattern1(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}

	private static void pattern2(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				System.out.print(num);
			}
			System.out.print("\n");
		}
	}

	private static void pattern3(int num) {
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----Pattern 1-----");
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		pattern1(num);
		
		System.out.println("\n-----Pattern 2-----");
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		pattern2(num);
		
		System.out.println("\n-----Pattern 3-----");
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		pattern3(num);
		
		sc.close();
	}
}
