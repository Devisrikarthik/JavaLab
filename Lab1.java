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
        sc.nextLine(); // consume leftover newline
        String str = sc.nextLine();
        boolean isPalindrome = true;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
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

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    static void countVowels(Scanner sc) {
    System.out.print("Enter a string: ");
    sc.nextLine(); // consume leftover newline
    String input = sc.nextLine().toLowerCase();
    int count = 0;
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;
        }
    }
    System.out.println("Vowel count: " + count);
    }
}
