
public class Problem5 {
	
	private static boolean isEven(int num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int num = 1;
		while(num <= 50) {
			if(isEven(num))
				System.out.print(num + " ");
			num++;
		}
	}

}
