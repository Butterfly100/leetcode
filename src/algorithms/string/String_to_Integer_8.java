package algorithms.string;

/**
 * 8. String to Integer (atoi)
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class String_to_Integer_8 {

    public static void main(String args[]) {
        String[] strs = new String[]{"   +0 123", "  -0012a42",
                "  +12a", "  -123aa", "12a", "123", "-123", "123456789100", "-123456789100",
                "", null, "  a123  ", "  ++123",
                "001", "   0+12"};
        for (String str : strs) {
            System.out.println("str=" + str + ", int=" + myAtoi(str));
        }
    }

    public static int myAtoi(String str) {
        if (null == str || "".equals(str)) {
            return 0;
        }
        boolean isNegative = false;
        boolean isStart = false;
        long num = 0;
        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (' ' == ch && !isStart) {
                continue;
            } else if ('+' == ch && !isStart) {
                isNegative = false;
                isStart = true;
            } else if ('-' == ch && !isStart) {
                isNegative = true;
                isStart = true;
            } else {
                int n = ch - '0';
                if (n < 0 || n > 9) {
                    if (isNegative) {
                        num = 0 - num;
                    }
                    return (int)num;
                }
                isStart = true;
                num = num * 10 + n;
                if (!isNegative && num > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (isNegative && ( (0-num) < Integer.MIN_VALUE)) {
                    return Integer.MIN_VALUE;
                }
            }
        }
        if (isNegative) {
            num = 0 - num;
        }
        return (int)num;
    }

}
