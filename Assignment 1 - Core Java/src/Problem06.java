
public class Problem6 {
	
	private static boolean isEven(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int num = 51;
		
		System.out.println("Odd numbers from 50-100: ");
		do {
			if(!isEven(num))
				System.out.print(num + " ");
			num++;
		} while(num <= 100);
	}

}
