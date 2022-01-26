import java.util.Scanner;

public class Problem12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt(), flag = 0;
		
		if(num == 0 || num == 1) 
			System.out.println("The number " + num + " is a COMPOSITE NUMBER!");
		
		else {
			for(int i = 2; i <= num/2; i++) {
				if(num % i == 0) {
					System.out.println("The number " + num + " is a COMPOSITE NUMBER!");
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
				System.out.println("The number " + num + " is a PRIME NUMBER!");
		}
				
		sc.close();
	}
}