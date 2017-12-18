package algorithms.string;

/**
 * 58. Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/description/
 */
public class Length_of_Last_Word_58 {

    public static void main(String args[]) {
        System.out.println(lengthOfLastWord(" Hello  World  "));
        System.out.println(lengthOfLastWord(""));
        System.out.println(lengthOfLastWord(" 1"));
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int len = 0;
        for (int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                if (i > 0 && s.charAt(i - 1) == ' ') {
                    len = 0;
                }
                len++;
            } else {
                continue;
            }
        }
        return len;
    }

}
