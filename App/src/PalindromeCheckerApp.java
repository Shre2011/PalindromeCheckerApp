import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        public static boolean isPalindrome(String str) {

            int start = 0;
            int end = str.length() - 1;

            while (start < end) {

                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }

                start++;
                end--;
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("=== Palindrome Checker (Ignore Spaces & Case) ===");
            System.out.print("Enter a string: ");

            String input = sc.nextLine();

            // Normalize string
            input = input.replaceAll("\\s+", "").toLowerCase();

            boolean result = isPalindrome(input);

            if (result)
                System.out.println("The string is a Palindrome.");
            else
                System.out.println("The string is NOT a Palindrome.");

            sc.close();
        }
    }


