import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive check
        input = input.replaceAll("\\s+", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Insert characters into both queue and stack
        for (char ch : input.toCharArray()) {
            queue.add(ch);     // FIFO
            stack.push(ch);    // LIFO
        }

        boolean isPalindrome = true;

        // Compare elements
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a Palindrome!");
        } else {
            System.out.println("It is NOT a Palindrome!");
        }

        scanner.close();
    }
}