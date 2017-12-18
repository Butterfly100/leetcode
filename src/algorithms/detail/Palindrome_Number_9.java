package algorithms.detail;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 */
public class Palindrome_Number_9 {

    public static void main(String args[]) {
        int[] values = new int[]{-2147447412, 123, 121,3, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        for (int value : values) {
            System.out.println(value + ":" + isPalindrome(value));
        }
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long num = 0;
        int n = x;
        while (n > 0) {
            num = num * 10 + n % 10;
            n = n / 10;
        }
        return (num == x);
    }

}
