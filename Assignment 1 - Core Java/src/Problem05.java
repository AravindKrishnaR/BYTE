
public class Problem05 {
	
	private static boolean isEven(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int num = 1;
		
		System.out.println("Even numbers from 1-50: ");
		while(num <= 50) {
			if(isEven(num))
				System.out.print(num + " ");
			num++;
		}
	}
}
