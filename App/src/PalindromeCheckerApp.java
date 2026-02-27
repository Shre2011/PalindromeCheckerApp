import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }

        // Close scanner
        scanner.close();
    }
}


