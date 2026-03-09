import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Method 1: Iterative (Two Pointer)
        public static boolean iterativePalindrome(String str) {

            int start = 0;
            int end = str.length() - 1;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end))
                    return false;

                start++;
                end--;
            }

            return true;
        }

        // Method 2: Stack Based
        public static boolean stackPalindrome(String str) {

            Stack<Character> stack = new Stack<>();

            for (char c : str.toCharArray()) {
                stack.push(c);
            }

            for (char c : str.toCharArray()) {
                if (c != stack.pop())
                    return false;
            }

            return true;
        }

        // Method 3: Recursive
        public static boolean recursivePalindrome(String str, int start, int end) {

            if (start >= end)
                return true;

            if (str.charAt(start) != str.charAt(end))
                return false;

            return recursivePalindrome(str, start + 1, end - 1);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("=== Palindrome Performance Comparison ===");
            System.out.print("Enter a string: ");

            String input = sc.nextLine();

            // Normalize string
            input = input.replaceAll("\\s+", "").toLowerCase();

            // Iterative approach timing
            long startTime = System.nanoTime();
            boolean result1 = iterativePalindrome(input);
            long endTime = System.nanoTime();
            long iterativeTime = endTime - startTime;

            // Stack approach timing
            startTime = System.nanoTime();
            boolean result2 = stackPalindrome(input);
            endTime = System.nanoTime();
            long stackTime = endTime - startTime;

            // Recursive approach timing
            startTime = System.nanoTime();
            boolean result3 = recursivePalindrome(input, 0, input.length() - 1);
            endTime = System.nanoTime();
            long recursiveTime = endTime - startTime;

            // Display results
            System.out.println("\nResults:");
            System.out.println("Iterative Approach: " + result1 + " | Time: " + iterativeTime + " ns");
            System.out.println("Stack Approach: " + result2 + " | Time: " + stackTime + " ns");
            System.out.println("Recursive Approach: " + result3 + " | Time: " + recursiveTime + " ns");

            sc.close();
        }
    }


