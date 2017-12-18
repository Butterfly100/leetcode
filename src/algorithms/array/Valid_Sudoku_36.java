package algorithms.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 36. Valid Sudoku
 * https://leetcode.com/problems/valid-sudoku/
 */
public class Valid_Sudoku_36 {

    public static void main(String args[]) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},

        };
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        HashMap<String, HashSet<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < board.length; i++) {
            char[] row = board[i];
            for (int j = 0 ; j < row.length; j++) {
                char num = board[i][j];
                if ('.' == num) {
                    continue;
                }
                HashSet rowSet = map.get("row" + i);
                if (null == rowSet) {
                    rowSet = new HashSet();
                    rowSet.add(num);
                    map.put("row" + i, rowSet);
                } else if (rowSet.contains(num)){
                    return false;
                } else {
                    rowSet.add(num);
                }

                HashSet columnSet = map.get("column" + j);
                if (null == columnSet) {
                    columnSet = new HashSet();
                    columnSet.add(num);
                    map.put("column" + j, columnSet);
                } else if (columnSet.contains(num)) {
                    return false;
                } else {
                    columnSet.add(num);
                }

                String boxKey = "box" + i / 3  + j / 3;
                HashSet boxSet = map.get(boxKey);
                if (null == boxSet) {
                    boxSet = new HashSet();
                    boxSet.add(num);
                    map.put(boxKey, boxSet);
                } else if (boxSet.contains(num)) {
                    return false;
                } else {
                    boxSet.add(num);
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku2(char[][] board) {
        int size = board.length;
        for(int i = 0 ; i < size; i++) {
            boolean[] tmp = new boolean[size + 1];
            for (int j = 0 ; j < size; j++) {
                char num = board[i][j];
                if ('.' == num) {
                    continue;
                }
                if (tmp[num - '0']) {
                    return false;
                } else {
                    tmp[num - '0'] = true;
                }
            }
        }
        for(int i = 0 ; i < size; i++) {
            boolean[] tmp = new boolean[size + 1];
            for (int j = 0 ; j < size; j++) {
                char num = board[j][i];
                if ('.' == num) {
                    continue;
                }
                if (tmp[num - '0']) {
                    return false;
                } else {
                    tmp[num - '0'] = true;
                }
            }
        }
        for (int k = 0 ; k < 3; k++) {
            for (int m = 0; m < 3; m++) {
                boolean[] tmp = new boolean[size + 1];
                for(int i = 0 ; i < 3; i++) {
                    for (int j = 0 ; j < 3; j++) {
                        char num = board[k * 3 + i][m * 3 + j];
                        if ('.' == num) {
                            continue;
                        }
                        if (tmp[num - '0']) {
                            return false;
                        } else {
                            tmp[num - '0'] = true;
                        }
                    }
                }
            }
        }
        return true;
    }

}
