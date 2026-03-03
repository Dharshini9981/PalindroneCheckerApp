import java.util.Deque;
import java.util.LinkedList;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toLowerCase().replaceAll("[^a-z]", "").toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPalindrome);
        scanner.close();
    }
}
