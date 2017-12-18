package algorithms.stack;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Valid_Parentheses_20 {

    public static void main(String[] args) {
        String[] strs = new String[]{"", null, "({[]([])})", "()(()]"};
        for (String str : strs) {
            System.out.println(str + ":" + isValid(str));
        }
    }

    public static boolean isValid(String s) {
        if (null == s || "".equals(s)) {
            return true;
        }
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || '(' != stack.lastElement()) {
                    return false;
                }
                stack.pop();
            } else if (ch == ']') {
                if (stack.isEmpty() || '[' != stack.lastElement()) {
                    return false;
                }
                stack.pop();
            } else if (ch == '}') {
                if (stack.isEmpty() || '{' != stack.lastElement()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

}
