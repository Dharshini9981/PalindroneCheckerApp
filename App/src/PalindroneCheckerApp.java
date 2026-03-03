import java.util.Scanner;

public class PalindroneCheckerApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String normalized = input.toLowerCase().replaceAll("[^a-z]", "");
        boolean isPalindrome = true;
        int left = 0;
        int right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is palindrome: " + isPalindrome);
        scanner.close();
    }
}
