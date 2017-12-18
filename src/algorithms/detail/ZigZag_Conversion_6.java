package algorithms.detail;

/**
 * 6. ZigZag Conversion
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZag_Conversion_6 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            String ret = new ZigZag_Conversion_6().convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", i);
            System.out.println("numRows=" + i + ":" + ret);
        }
    }

    public String convert(String s, int numRows) {
        if (1 == numRows) {
            return s;
        }
        StringBuilder ret = new StringBuilder();
        int group = 2 * numRows - 2;
        for (int i = 0 ; i < numRows; i++) {
            if (0 ==i || (numRows-1) == i) {
                int j = 0;
                int index = j * group + i;
                while (index < s.length()) {
                    ret.append(s.charAt(index));
                    j++;
                    index = j * group + i;
                }
            } else {
                int j = 0;
                int index1 = j * group + i;
                int index2 = j * group + group - i;
                while (index1 < s.length()) {
                    ret.append(s.charAt(index1));
                    if (index2 < s.length()) {
                        ret.append(s.charAt(index2));
                    }
                    j++;
                    index1 = j * group + i;
                    index2 = j * group + group - i;
                }
            }
        }
        return ret.toString();
    }

}
