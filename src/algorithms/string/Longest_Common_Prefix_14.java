package algorithms.string;

/**
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class Longest_Common_Prefix_14 {

    public static void main(String args[]) {
        String[] strs = new String[]{"abc", "abd", "abcde"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length < 1) {
            return "";
        }
        StringBuilder s = new StringBuilder();
        int i = 0;
        while (true) {
            Character ch = null;
            for (String str : strs) {
                if (null == str || i >= str.length()) {
                    return s.toString();
                }
                if (null == ch) {
                    ch = str.charAt(i);
                }
                if (str.charAt(i) != ch) {
                    return s.toString();
                }
            }
            s.append(ch);
            i++;
        }
    }

}

