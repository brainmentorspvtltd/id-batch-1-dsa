public class PalindromeNumber {
    static boolean isPalindrome(int num, int org, int reverse) {
        // base case
        if (num == 0) {
            return org == reverse;
        }
        int digit = num % 10;
        reverse = reverse * 10 + digit;
        return isPalindrome(num / 10, org, reverse); // RR - num/10
    }

    // static int palindrome(int num) {

    // }

    public static void main(String[] args) {
        boolean result = isPalindrome(151, 151, 0);
        System.out.println(result ? "Palindrome" : "Not");
    }
}
