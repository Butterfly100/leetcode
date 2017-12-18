package algorithms.detail;

/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 */
public class Reverse_Integer_7 {

    public static void main(String[] args) {
        int[] values = new int[]{123, -123, 1, -1, 0, 1534236469, -1534236469, 100, -100};
        for (int value : values) {
            int y = reverse(value);
            System.out.println("x = " + value + ", y = " + y);
        }
    }

    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0){
            isNegative = true;
            x = 0 - x;
        }
        long y = 0;
        while (x > 0) {
            int a = x % 10;
            y = y * 10 + a;
            x = x / 10;
        }
        if (isNegative) {
            y = 0 - y;
        }
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            y = 0;
        }
        return (int)y;
    }

}
