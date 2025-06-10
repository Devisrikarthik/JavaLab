/*Write a java code to perform the String Operations
Hide Last 4 Digits of a Phone Number
Hide Middle Part of an Email
Replace All Characters Except First and Last*/

import java.util.*;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hide last 4 digits of phone number
        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();
        if (phone.length() > 4) {
            String hiddenPhone = phone.substring(0, phone.length() - 4) + "****";
            System.out.println("Hidden phone number: " + hiddenPhone);
        } else {
            System.out.println("Phone number too short to hide last 4 digits.");
        }

        // Hide middle part of email
        System.out.print("\nEnter email: ");
        String email = sc.nextLine();
        int at = email.indexOf('@');
        if (at > 1) {
            String hiddenEmail = email.charAt(0) + "*****" + email.substring(at - 1);
            System.out.println("Hidden email: " + hiddenEmail);
        } else {
            System.out.println("Invalid email.");
        }

        // Replace all characters except first and last
        System.out.print("\nEnter a word: ");
        String word = sc.nextLine();
        if (word.length() <= 2) {
            System.out.println("Result: " + word);
        } else {
            String hiddenMiddle = word.charAt(0) + "*".repeat(word.length() - 2) + word.charAt(word.length() - 1);
            System.out.println("Hidden word: " + hiddenMiddle);
        }
    }
}
