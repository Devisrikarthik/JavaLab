/*Write a Java program to reverse a number

Write a Java program to calculate the factorial of a number using a loop

Write a Java program to check if a string is a palindrome

Write a Java program to sort an array in ascending order

Write a Java program to count vowels in a string*/

import java.util.*;

public class Lab1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        reverseNumber(sc);
        factorial(sc);
        checkPalindrome(sc);
        sortArray(sc);
        countVowels(sc);
    }

    static void reverseNumber(Scanner sc) {
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }

    static void factorial(Scanner sc) {
        System.out.print("Enter a number to find Factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        while (num != 0) {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial: " + fact);
    }

    static void checkPalindrome(Scanner sc) {
        System.out.print("Enter a string to check for Palindrome: ");
        sc.nextLine();
        String str = sc.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }

    static void sortArray(Scanner sc) {
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void countVowels(Scanner sc) {
        System.out.print("Enter a string: ");
        sc.nextLine();
        String input = sc.nextLine().toLowerCase();
        int count = 0;
        for (char ch : input.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println("Vowel count: " + count);
    }
}
