import java.util.Scanner;

public class Problem4 {
	
	private static boolean ifVowel(char character) {
		/*if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
			return true;
		else 
			return false;*/
		
		switch(character) {
		//break keyword is not required here because the function is returning a boolean value and the break keyword would be unreachable
		case 'a': return true;
		case 'e': return true;
		case 'i': return true;
		case 'o': return true;
		case 'u': return true;
		default: return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char character = sc.next().charAt(0);
		
		if(ifVowel(character))
			System.out.println("The character " + character + " is a VOWEL!");
		else 
			System.out.println("The character " + character + " is a CONSONANT!");
		
		sc.close();
	}
}
