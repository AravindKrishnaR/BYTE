import java.util.Scanner;

public class Problem09 {

	static void reverse(int[] arr, int num)
	{
		int[] rev_arr = new int[num];
		int j = num;
		for (int i = 0; i < num; i++) {
			rev_arr[j - 1] = arr[i];
			j = j - 1;
		}

		System.out.println("\nAfter reversing: ");
		for(int i = 0; i < num; i++)
			System.out.print(rev_arr[i] + " ");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		System.out.print("Enter the elements: ");
		for(int i = 0; i < num; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("\nBefore reversing: ");
		for(int i = 0; i < num; i++)
			System.out.print(arr[i] + " ");
		
		reverse(arr, arr.length);
		
		sc.close();
	}
}
