import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String original = scanner.nextLine();

        // Reverse the string using loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }

        // Close scanner
        scanner.close();
    }
}


