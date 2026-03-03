class ObjectOrientedPalindromeService {
    public static void main(String[] args) {
        ObjectOrientedPalindromeService service = new ObjectOrientedPalindromeService();
        String input = "A man a plan a canal Panama";
        boolean result = service.isPalindrome(input);
        System.out.println("Is palindrome: " + result);
    }

    public boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().replaceAll("[^a-z]", "");
        return checkPalindrome(normalized, 0, normalized.length() - 1);
    }

    private boolean checkPalindrome(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return checkPalindrome(str, left + 1, right - 1);
    }
}
