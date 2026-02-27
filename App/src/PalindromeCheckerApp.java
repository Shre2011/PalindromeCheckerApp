import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

            // Create Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Ask user for input
            System.out.println("Enter a string to check if it is a palindrome:");
            String word = scanner.nextLine();

            boolean isPalindrome = true;

            // Palindrome checking logic
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Display result
            if (isPalindrome) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is not a Palindrome");
            }

            // Close scanner
            scanner.close();
        }
}


