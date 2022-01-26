import java.util.Scanner;

public class Problem14 {
	
	private static int reverse(int num) {
		int result = 0;
		while (num > 0) {
			result = result * 10 + num % 10;
			num /= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int result = reverse(num);
		System.out.println("The reverse of " + num + " is: " + result);
		
		sc.close();
	}
}