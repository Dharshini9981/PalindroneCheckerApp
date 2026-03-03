import java.util.Scanner;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = isPalindrome(input.toLowerCase().replaceAll("[^a-z]", ""), start, end);
        System.out.println("Is palindrome: " + isPalindrome);
        scanner.close();
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }
}
