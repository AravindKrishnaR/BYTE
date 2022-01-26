import java.util.Scanner;

public class Problem10 {
	
	private static void swapArray(int[] arr1, int[] arr2, int size) {
		int[] temp = new int[size];
		
		for (int i = 0; i < size; i++) {
            temp[i] = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp[i];
        }
        System.out.println("\n\n-----After Swapping-----");
        System.out.println("First Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nSecond Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();
        
        int[] arr1 = new int[size], arr2 = new int[size];
        System.out.print("\nEnter the elements of the First Array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        
        System.out.print("Enter the elements of the Second Array: ");
        for (int i = 0; i < size; i++) {
            arr2[i] = sc.nextInt();
        }
        
        System.out.println("\n-----Before Swapping-----");
        
        System.out.println("First Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " ");
        }
        
        System.out.println("\nSecond Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        swapArray(arr1, arr2, size);
        
        sc.close();
    }
}