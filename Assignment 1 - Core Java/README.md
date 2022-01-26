**Aravind Krishna R                                                                                 Java Assignment**

-----
**Java Assignment - 1**

1) **Write a program to find whether the no entered by the user is even or odd.**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem1 {**</p><p>**    </p><p>`    `**private static boolean isEven(int num) {**</p><p>`        `**if(num % 2 == 0)**</p><p>`            `**return true;**</p><p>`        `**else**</p><p>`            `**return false;**</p><p>`    `**}**</p><p></p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter a number: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>**        </p><p>`        `**if(isEven(num))**</p><p>`            `**System.out.println("The number " + num + " is EVEN!");**</p><p>`        `**else**</p><p>`            `**System.out.println("The number " + num + " is ODD!");**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p>|
| :- |

|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.001.png)|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.002.png)|
| :- | :- |

||
| :- |


1) **Write a program to swap the values of 2 nos. (Take input from the user).**

`	`**eg a=10 b=20f**

**after swapping**

**a=20 b=10**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem2 {**</p><p>**    </p><p>`    `**private static void swap(int num1, int num2) {**</p><p>`        `**num1 = num1 + num2;**</p><p>`        `**num2 = num1 - num2;**</p><p>`        `**num1 = num1 - num2;**</p><p>**        </p><p>`        `**System.out.println("\nAfter swap: \nNumber 1: " + num1 + "\tNumber 2: " + num2);**</p><p>`    `**}**</p><p>**    </p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter 2 numbers: ");**</p><p>`        `**int num1 = sc.nextInt();**</p><p>`        `**int num2 = sc.nextInt();**</p><p>**        </p><p>`        `**System.out.println("\nBefore swap: \nNumber 1: " + num1 + "\tNumber 2: " + num2);**</p><p>**        </p><p>`        `**swap(num1, num2);**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.003.png)</p>|
| :- |

1) **Write a program to find the greatest between the 3 nos and display the output. (Take input from the user).**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem3 {**</p><p>**    </p><p>`    `**private static int greatest(int num1, int num2, int num3) {**</p><p>`        `**if(num1 > num2 && num1 > num3)**</p><p>`            `**return num1;**</p><p>`        `**else if(num2 > num1 && num2 > num3)**</p><p>`            `**return num1;**</p><p>`        `**else**</p><p>`            `**return num3;**</p><p>`    `**}**</p><p>**    </p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter 3 numbers: ");**</p><p>`        `**int num1 = sc.nextInt();**</p><p>`        `**int num2 = sc.nextInt();**</p><p>`        `**int num3 = sc.nextInt();**</p><p>**        </p><p>`        `**int result = greatest(num1, num2, num3);**</p><p>**        </p><p>`        `**System.out.println("The greatest number is: " + result);**</p><p>**                </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.004.png)</p>|
| :- |

1) **Write a program to find whether the character entered by the user is a vowel or not. (Solve by using if..else and switch case).**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem4 {**</p><p>**    </p><p>`    `**private static boolean ifVowel(char character) {**</p><p>`        `**/\*if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')**</p><p>`            `**return true;**</p><p>`        `**else**</p><p>`            `**return false;\*/**</p><p>**        </p><p>`        `**switch(character) {**</p><p>`        `**//break keyword is not required here because the function is returning a boolean value and the break keyword would be unreachable**</p><p>`        `**case 'a': return true;**</p><p>`        `**case 'e': return true;**</p><p>`        `**case 'i': return true;**</p><p>`        `**case 'o': return true;**</p><p>`        `**case 'u': return true;**</p><p>`        `**default: return false;**</p><p>`        `**}**</p><p>`    `**}**</p><p></p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter a character: ");**</p><p>`        `**char character = sc.next().charAt(0);**</p><p>**        </p><p>`        `**if(ifVowel(character))**</p><p>`            `**System.out.println("The character " + character + " is a VOWEL!");**</p><p>`        `**else**</p><p>`            `**System.out.println("The character " + character + " is a CONSONANT!");**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p>|
| :- |

|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.005.png)|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.006.png)|
| :- | :- |

||
| :- |

1) **Write a program to print even nos from 1-50 using while loop.**


|<p>**public class Problem5 {**</p><p>**    </p><p>`    `**private static boolean isEven(int num) {**</p><p>`        `**if(num % 2 == 0)**</p><p>`            `**return true;**</p><p>`        `**else**</p><p>`            `**return false;**</p><p>`    `**}**</p><p>**    </p><p>`    `**public static void main(String[] args) {**</p><p>`        `**int num = 1;**</p><p>**        </p><p>`        `**System.out.println("Even numbers from 1-50: ");**</p><p>`        `**while(num <= 50) {**</p><p>`            `**if(isEven(num))**</p><p>`                `**System.out.print(num + " ");**</p><p>`            `**num++;**</p><p>`        `**}**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.007.png)</p>|
| :- |

1) **Write a program to print odd nos from 50-100 using do-while loop.**


|<p>**public class Problem6 {**</p><p></p><p>`    `**private static boolean isEven(int num) {**</p><p>`        `**if(num % 2 == 0)**</p><p>`            `**return true;**</p><p>`        `**else**</p><p>`            `**return false;**</p><p>`    `**}**</p><p>**    </p><p>`    `**public static void main(String[] args) {**</p><p>`        `**int num = 51;**</p><p>**        </p><p>`        `**System.out.println("Odd numbers from 50-100: ");**</p><p>`        `**do {**</p><p>`            `**if(!isEven(num))**</p><p>`                `**System.out.print(num + " ");**</p><p>`            `**num++;**</p><p>`        `**} while(num <= 100);**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.008.png)</p>|
| :- |

1) **Given a number N, print sum of all even numbers from 1 to N.**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem7 {**</p><p>**    </p><p>`    `**private static boolean isEven(int num) {**</p><p>`        `**if(num % 2 == 0)**</p><p>`            `**return true;**</p><p>`        `**else**</p><p>`            `**return false;**</p><p>`    `**}**</p><p>**    </p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter a number: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>**        </p><p>`        `**int i = 0, sum = 0;**</p><p>`        `**while(i <= num) {**</p><p>`            `**if(isEven(i))**</p><p>`                `**sum += i;**</p><p>`            `**i++;**</p><p>`        `**}**</p><p>`        `**System.out.println("Sum of all even numbers from 1 to " + num + " is: " + sum);**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.009.png)</p>|
| :- |


1) **Write a program to print the following patterns:**

|<p>&emsp;a) **for n=4**</p><p>**1**</p><p>**22**</p><p>**333**</p><p>**4444**</p>|<p>b) **for n=4**</p><p>**4444**</p><p>**4444**</p><p>**4444**</p><p>**4444**</p>|<p>c) **for n=5**</p><p>`        `**\***</p><p>`      `**\*\***</p><p>`    `**\*\*\***</p><p>`  `**\*\*\*\***</p><p>**\*\*\*\*\***</p>|
| - | - | - |


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem8 {**</p><p>**    </p><p>`    `**private static void pattern1(int num) {**</p><p>`        `**for(int i = 1; i <= num; i++) {**</p><p>`            `**for(int j = 1; j <= i; j++) {**</p><p>`                `**System.out.print(i);**</p><p>`            `**}**</p><p>`            `**System.out.print("\n");**</p><p>`        `**}**</p><p>`    `**}**</p><p></p><p>`    `**private static void pattern2(int num) {**</p><p>`        `**for(int i = 1; i <= num; i++) {**</p><p>`            `**for(int j = 1; j <= num; j++) {**</p><p>`                `**System.out.print(num);**</p><p>`            `**}**</p><p>`            `**System.out.print("\n");**</p><p>`        `**}**</p><p>`    `**}**</p><p></p><p>`    `**private static void pattern3(int num) {**</p><p>`        `**for(int i = 1; i <= num; i++) {**</p><p>`            `**for(int j = 1; j <= num-i; j++) {**</p><p>`                `**System.out.print(" ");**</p><p>`            `**}**</p><p>`            `**for(int j = 1; j <= i; j++) {**</p><p>`                `**System.out.print("\*");**</p><p>`            `**}**</p><p>`            `**System.out.print("\n");**</p><p>`        `**}**</p><p>`    `**}**</p><p></p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.println("-----Pattern 1-----");**</p><p>`        `**System.out.print("Enter a number: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>`        `**pattern1(num);**</p><p>**        </p><p>`        `**System.out.println("\n-----Pattern 2-----");**</p><p>`        `**System.out.print("Enter a number: ");**</p><p>`        `**num = sc.nextInt();**</p><p>`        `**pattern2(num);**</p><p>**        </p><p>`        `**System.out.println("\n-----Pattern 3-----");**</p><p>`        `**System.out.print("Enter a number: ");**</p><p>`        `**num = sc.nextInt();**</p><p>`        `**pattern3(num);**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p>|
| :- |

|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.010.png)|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.011.png)|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.012.png)|
| :- | :- | :- |

||
| :- |

1) **Write a program to reverse an Array.**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem9 {**</p><p></p><p>`    `**static void reverse(int[] arr, int num)**</p><p>`    `**{**</p><p>`        `**int[] rev\_arr = new int[num];**</p><p>`        `**int j = num;**</p><p>`        `**for (int i = 0; i < num; i++) {**</p><p>`            `**rev\_arr[j - 1] = arr[i];**</p><p>`            `**j = j - 1;**</p><p>`        `**}**</p><p></p><p>`        `**System.out.println("\nAfter reversing: ");**</p><p>`        `**for(int i = 0; i < num; i++)**</p><p>`            `**System.out.print(rev\_arr[i] + " ");**</p><p>`    `**}**</p><p></p><p>`    `**public static void main(String[] args)**</p><p>`    `**{**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter the size of the array: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>**        </p><p>`        `**int[] arr = new int[num];**</p><p>**        </p><p>`        `**System.out.print("Enter the elements: ");**</p><p>`        `**for(int i = 0; i < num; i++)**</p><p>`            `**arr[i] = sc.nextInt();**</p><p>**        </p><p>`        `**System.out.println("\nBefore reversing: ");**</p><p>`        `**for(int i = 0; i < num; i++)**</p><p>`            `**System.out.print(arr[i] + " ");**</p><p>**        </p><p>`        `**reverse(arr, arr.length);**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.013.png)</p>|
| :- |

1) **Write a program to Swap the nos in Array.**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem10 {**</p><p>**    </p><p>`    `**private static void swapArray(int[] arr1, int[] arr2, int size) {**</p><p>`        `**int[] temp = new int[size];**</p><p>**        </p><p>`        `**for (int i = 0; i < size; i++) {**</p><p>`           `**temp[i] = arr1[i];**</p><p>`           `**arr1[i] = arr2[i];**</p><p>`           `**arr2[i] = temp[i];**</p><p>`       `**}**</p><p>`       `**System.out.println("\n\n-----After Swapping-----");**</p><p>`       `**System.out.println("First Array: ");**</p><p>`       `**for (int i = 0; i < size; i++) {**</p><p>`           `**System.out.print(arr1[i] + " ");**</p><p>`       `**}**</p><p>`       `**System.out.println("\nSecond Array: ");**</p><p>`       `**for (int i = 0; i < size; i++) {**</p><p>`           `**System.out.print(arr2[i] + " ");**</p><p>`       `**}**</p><p>`    `**}**</p><p>**    </p><p>`   `**public static void main(String[] args) {**</p><p>`       `**Scanner sc = new Scanner(System.in);**</p><p>`       `**System.out.print("Enter the size of the arrays: ");**</p><p>`       `**int size = sc.nextInt();**</p><p>**      </p><p>`       `**int[] arr1 = new int[size], arr2 = new int[size];**</p><p>`       `**System.out.print("\nEnter the elements of the First Array: ");**</p><p>`       `**for (int i = 0; i < size; i++) {**</p><p>`           `**arr1[i] = sc.nextInt();**</p><p>`       `**}**</p><p>**      </p><p>`       `**System.out.print("Enter the elements of the Second Array: ");**</p><p>`       `**for (int i = 0; i < size; i++) {**</p><p>`           `**arr2[i] = sc.nextInt();**</p><p>`       `**}**</p><p>**      </p><p>`       `**System.out.println("\n-----Before Swapping-----");**</p><p>**      </p><p>`       `**System.out.println("First Array: ");**</p><p>`       `**for (int i = 0; i < size; i++) {**</p><p>`           `**System.out.print(arr1[i] + " ");**</p><p>`       `**}**</p><p>**      </p><p>`       `**System.out.println("\nSecond Array: ");**</p><p>`       `**for (int i = 0; i < size; i++) {**</p><p>`           `**System.out.print(arr2[i] + " ");**</p><p>`       `**}**</p><p>**      </p><p>`       `**swapArray(arr1, arr2, size);**</p><p>**      </p><p>`       `**sc.close();**</p><p>`   `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.014.png)</p>|
| :- |

1) **Write a program to calculate and display the factorial of a no entered by the user.**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem11 {**</p><p>**    </p><p>`    `**private static int factorial(int num) {**</p><p>`        `**int fact = 1;**</p><p>`        `**for(int i = 1; i <= num; i++)**</p><p>`            `**fact \*= i;**</p><p>**        </p><p>`        `**return fact;**</p><p>`    `**}**</p><p></p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter the number: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>**        </p><p>`        `**int fact = factorial(num);**</p><p>`        `**System.out.println("The factorial of " + num + " is: " + fact);**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.015.png)</p>|
| :- |

1) **Write a program to check whether the no entered by the user is prime or not.**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem12 {**</p><p>**    </p><p>`    `**private static boolean isPrime(int num) {**</p><p>`        `**if (num <= 1)**</p><p>`            `**return false;**</p><p></p><p>`        `**for (int i = 2; i < num; i++)**</p><p>`            `**if (num % i == 0)**</p><p>`                `**return false;**</p><p></p><p>`        `**return true;**</p><p>`    `**}**</p><p>**    </p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter the number: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>**        </p><p>`        `**if(isPrime(num))**</p><p>`            `**System.out.println("The number " + num + " is a PRIME NUMBER!");**</p><p>`        `**else**</p><p>`            `**System.out.println("The number " + num + " is a COMPOSITE NUMBER!");**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**      </p><p>-----</p>|
| :- |

|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.016.png)|![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.017.png)|
| :- | :- |

||
| :- |

1) **Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem13 {**</p><p></p><p>`    `**private static boolean isPrime(int num) {**</p><p>`        `**if (num <= 1)**</p><p>`            `**return false;**</p><p></p><p>`        `**for (int i = 2; i < num; i++)**</p><p>`            `**if (num % i == 0)**</p><p>`                `**return false;**</p><p></p><p>`        `**return true;**</p><p>`    `**}**</p><p></p><p>`    `**private static void printPrimeNums(int num) {**</p><p>`        `**for (int i = 2; i <= num; i++) {**</p><p>`            `**if (isPrime(i))**</p><p>`                `**System.out.print(i + " ");**</p><p>`        `**}**</p><p>`    `**}**</p><p></p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p></p><p>`        `**System.out.print("Enter the number: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>**        </p><p>`        `**System.out.println("\nPrime numbers between 2 and " + num + ": ");**</p><p>`        `**printPrimeNums(num);**</p><p></p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.018.png)</p>|
| :- |

1) **Write a program to generate the reverse of a given number N. Print the corresponding reverse number.**


|<p>**import java.util.Scanner;**</p><p></p><p>**public class Problem14 {**</p><p>**    </p><p>`    `**private static int reverse(int num) {**</p><p>`        `**int result = 0;**</p><p>`        `**while (num > 0) {**</p><p>`            `**result = result \* 10 + num % 10;**</p><p>`            `**num /= 10;**</p><p>`        `**}**</p><p>`        `**return result;**</p><p>`    `**}**</p><p></p><p>`    `**public static void main(String[] args) {**</p><p>`        `**Scanner sc = new Scanner(System.in);**</p><p>**        </p><p>`        `**System.out.print("Enter the number: ");**</p><p>`        `**int num = sc.nextInt();**</p><p>**        </p><p>`        `**int result = reverse(num);**</p><p>`        `**System.out.println("The reverse of " + num + " is: " + result);**</p><p>**        </p><p>`        `**sc.close();**</p><p>`    `**}**</p><p>**}**</p><p>-----</p><p>![](Aspose.Words.7aa36910-9c93-47ee-92fa-67391a9577c9.019.png)</p>|
| :- |

