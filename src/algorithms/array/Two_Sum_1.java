package algorithms.array;

import java.util.HashMap;

/**
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 */
public class Two_Sum_1 {

    public static void main(String args[]) {
        int[] rets = new Two_Sum_1().towSum2(new int[]{3,2,4}, 6);
        for (int ret : rets) {
            System.out.println(ret);
        }
    }

    /**
     * i=0->len  j=i+1->len if(nums[i] + num[j] == target) ok
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    public int[] towSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            Integer index = map.get(another);
            if (index != null) {
                return new int[]{index, i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no tow sum solution");
    }

}
