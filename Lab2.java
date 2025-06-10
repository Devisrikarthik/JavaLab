/*1. Write a java program to check if a given string is palindrome using charAt method and length method.
2. Write a program to count the number of vowels consonants digits and special characters in a string
( Use methods like toLowerCase, charAt and isDigit ).
3. Write a program to compare two strings ignoring case differences use equalsIgnoreCase method.
4. Write a program to find the first and last occurence of a character using indexOf and lastIndexOf method
5. Write a program to reverse a string using a loop and charAt method.
6. Write a program to split a sentence into words using split method. And print each word on a new line.
7. Write a program to check if a string starts and ends with a specific word using startWith and endsWith method.*/

import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        characterCount();
        characterOccurrence();
        nameShortcut();
        palindromeCheck();
        reverseString();
        specificWord();
        splitSentence();
        stringCompare();
    }

    static void characterCount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            } else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
    }

    static void characterOccurrence() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the character to find: ");
        char ch = scanner.next().charAt(0);

        scanner.close();

        int firstIndex = str.indexOf(ch);
        int lastIndex = str.lastIndexOf(ch);

        if (firstIndex == -1) {
            System.out.println("The character '" + ch + "' is not found in the string.");
        } else {
            System.out.println("First occurrence of '" + ch + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + ch + "' is at index: " + lastIndex);
        }
    }

    static void nameShortcut() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name with First, Middle and Last Name: ");
        String name = sc.nextLine();
        String[] parts = name.split(" ");
        for (int i = 0; i < parts.length - 1; i++) {
            System.out.print(parts[i].charAt(0) + ". ");
        }
        System.out.println(parts[parts.length - 1]);
    }

    static void palindromeCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("Palindrome: Yes");
        else
            System.out.println("Palindrome: No");
    }

    static void reverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }

    static void specificWord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the word to check at the start: ");
        String start = sc.nextLine();

        System.out.print("Enter the word to check at the end: ");
        String end = sc.nextLine();

        sc.close();

        if (str.startsWith(start)) {
            System.out.println("The string starts with \"" + start + "\".");
        } else {
            System.out.println("The string does not start with \"" + start + "\".");
        }

        if (str.endsWith(end)) {
            System.out.println("The string ends with \"" + end + "\".");
        } else {
            System.out.println("The string does not end with \"" + end + "\".");
        }
    }

    static void splitSentence() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        System.out.println("Words in sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    static void stringCompare() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if (str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}
