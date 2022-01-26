import java.util.Scanner;

public class Problem03 {
	
	private static int greatest(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3)
			return num1;
		else if(num2 > num1 && num2 > num3)
			return num1;
		else
			return num3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int result = greatest(num1, num2, num3);
		
		System.out.println("The greatest number is: " + result);
				
		sc.close();
	}
}
