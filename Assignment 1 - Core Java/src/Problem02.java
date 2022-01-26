import java.util.Scanner;

public class Problem02 {
	
	private static void swap(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("\nAfter swap: \nNumber 1: " + num1 + "\tNumber 2: " + num2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("\nBefore swap: \nNumber 1: " + num1 + "\tNumber 2: " + num2);
		
		swap(num1, num2);
		
		sc.close();
	}
}
