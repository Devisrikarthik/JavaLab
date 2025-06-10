/*input array and a string and perform some operations,use methods on that array like sorting ,printing,replacing etc 
and string operations like length,index of ,starts with ,ends with ,index of etc*/

import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        int[] arr = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Trim spaces");
            System.out.println("2. Convert to UpperCase");
            System.out.println("3. Convert to LowerCase");
            System.out.println("4. Get string length");
            System.out.println("5. Extract substring");
            System.out.println("6. Find a character");
            System.out.println("7. Replace a word");
            System.out.println("8. Split string");
            System.out.println("9. Check if it contains PROUD");
            System.out.println("10. Check if it starts with \"I AM\"");
            System.out.println("11. Check if it ends with \"VITIAN\"");
            System.out.println("12. Find max in the array");
            System.out.println("13. Find min in the array");
            System.out.println("14. Sort array in ascending order");
            System.out.println("15. Sort array in descending order");
            System.out.println("16. Print the string");
            System.out.println("17. Print the integer array");
            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    str = str.trim();
                    System.out.println("Trimmed String: " + str);
                    break;
                case 2:
                    str = str.toUpperCase();
                    System.out.println("Converted string: " + str);
                    break;
                case 3:
                    str = str.toLowerCase();
                    System.out.println("Converted string: " + str);
                    break;
                case 4:
                    System.out.println("String length: " + str.length());
                    break;
                case 5:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    if (start >= 0 && end <= str.length() && start < end) {
                        System.out.println("Substring: " + str.substring(start, end));
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case 6:
                    System.out.print("Enter index to find character: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < str.length()) {
                        System.out.println("Character at index " + index + ": " + str.charAt(index));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 7:
                    System.out.print("Enter word to be replaced: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter new word: ");
                    String newWord = sc.nextLine();
                    str = str.replace(oldWord, newWord);
                    System.out.println("Updated String: " + str);
                    break;
                case 8:
                    String[] words = str.split(" ");
                    System.out.println("Splitted words:");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;
                case 9:
                    if (str.toUpperCase().contains("PROUD")) {
                        System.out.println("The string contains 'PROUD'");
                    } else {
                        System.out.println("The string does not contain 'PROUD'");
                    }
                    break;
                case 10:
                    if (str.startsWith("I AM")) {
                        System.out.println("The string starts with 'I AM'");
                    } else {
                        System.out.println("The string does not start with 'I AM'");
                    }
                    break;
                case 11:
                    if (str.endsWith("VITIAN")) {
                        System.out.println("The string ends with 'VITIAN'");
                    } else {
                        System.out.println("The string does not end with 'VITIAN'");
                    }
                    break;
                case 12:
                    int max = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > max) max = arr[i];
                    }
                    System.out.println("Maximum value: " + max);
                    break;
                case 13:
                    int min = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] < min) min = arr[i];
                    }
                    System.out.println("Minimum value: " + min);
                    break;
                case 14:
                    Arrays.sort(arr);
                    System.out.println("Sorted in ascending order: " + Arrays.toString(arr));
                    break;
                case 15:
                    Arrays.sort(arr);
                    System.out.print("Sorted in descending order: ");
                    for (int i = arr.length - 1; i >= 0; i--) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                case 16:
                    System.out.println("Current String: " + str);
                    break;
                case 17:
                    System.out.println("Integer Array: " + Arrays.toString(arr));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }
}
