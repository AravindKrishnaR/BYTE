import java.util.Scanner;

public class Problem7 {
	
	private static boolean isEven(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int i = 0, sum = 0;
		while(i <= num) {
			if(isEven(i))
				sum += i;
			i++;
		}
		System.out.println("Sum of all even numbers from 1 to " + num + " is: " + sum);
		
		sc.close();
	}
}
