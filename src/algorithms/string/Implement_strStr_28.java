package algorithms.string;

/**
 * 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 */
public class Implement_strStr_28 {

    public static void main(String[] args) {
        String haystack = "";
        String needle = "";
        System.out.println(strStr(haystack, needle));
    }

    /**
     * TODO KMP
     */
    public static int strStr(String haystack, String needle) {
        if (null == haystack || null == needle) {
            return -1;
        }

        char[] haystacks = haystack.toCharArray();
        for (int i = 0; (i + needle.length()) <= haystacks.length; i++) {
            String tmp = haystack.substring(i, i + needle.length());
            if (tmp.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
