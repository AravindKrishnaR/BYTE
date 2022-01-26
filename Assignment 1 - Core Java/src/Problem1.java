import java.util.Scanner;

public class Problem1 {
	
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
		
		if(isEven(num)) 
			System.out.println("The number " + num + " is EVEN!");
		else 
			System.out.println("The number " + num + " is ODD!");
		
		sc.close();
	}
}
