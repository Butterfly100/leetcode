package algorithms.string;

/**
 * 38. Count and Say
 * https://leetcode.com/problems/count-and-say/description/
 */
public class Count_and_Say_38 {

    public static void main(String args[]) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(10));
    }

    public static String countAndSay(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n < 0, illegal");
        }
        if (n == 1) {
            return "1";
        }
        String preStr = countAndSay(n - 1);
        char[] preChars = preStr.toCharArray();
        StringBuilder result = new StringBuilder();

        char ch = preChars[0];
        int count = 1;
        for (int i = 1; i < preChars.length; i++) {
            if (preChars[i] == ch) {
                count++;
            } else {
                result.append(count).append(ch);
                ch = preChars[i];
                count = 1;
            }
        }
        result.append(count).append(ch);
        return result.toString();
    }

}
