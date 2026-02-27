import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public class UseCase6PalindromeCheckerApp {

        public static void main(String[] args) {

            // Create Scanner object
            Scanner scanner = new Scanner(System.in);

            // Take input from user
            System.out.println("Enter a string to check if it is a palindrome:");
            String input = scanner.nextLine();

            // Create Stack and Queue
            Stack<Character> stack = new Stack<>();
            Queue<Character> queue = new LinkedList<>();

            // Push to stack and enqueue to queue
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                stack.push(ch);
                queue.add(ch);
            }

            boolean isPalindrome = true;

            // Compare pop (stack) and dequeue (queue)
            while (!stack.isEmpty()) {
                if (stack.pop() != queue.remove()) {
                    isPalindrome = false;
                    break;
                }
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


