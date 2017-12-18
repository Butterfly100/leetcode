package algorithms.string;

/**
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 */
public class Roman_to_Integer_13 {

    public static void main(String args[]) {
        String[] strs = new String[]{"MCMLXXXIII", "IV", "III"};
        for (String str : strs) {
            System.out.println(str + ":" + romanToInt(str));
        }
    }

    public static int romanToInt(String s) {
        if (null == s || "".equals(s)) {
            return 0;
        }
        int[] map = new int[256];
        map['M'] = 1000;
        map['D'] = 500;
        map['C'] = 100;
        map['L'] = 50;
        map['X'] = 10;
        map['V'] = 5;
        map['I'] = 1;
        int num = 0;
        char[] chars = s.toCharArray();
        for (int i=0; i<s.length(); i++) {
            char ch = chars[i];
            int value = map[ch];
            if ((i+1) < s.length()) {
                char nextCh = chars[i+1];
                int nextValue = map[nextCh];
                if (value >= nextValue) {
                    num += value;
                } else {
                    num -= value;
                }
            } else {
                num += value;
            }
        }
        return num;
    }

}
