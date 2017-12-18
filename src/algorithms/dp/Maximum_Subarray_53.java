package algorithms.dp;

/**
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 */
public class Maximum_Subarray_53 {

    public static void main(String args[]) {
//        System.out.println(maxSubArray(new int[]{}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1,-5, 4}));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("nums is empty");
        }
        int maxSum = nums[0];   // 以nums[i]结尾的最大连续子序列和
        int maxHere = nums[0];  // nums[0~i]的最大连续子序列和
        for (int i = 1; i < nums.length; i++) {
            if (maxHere + nums[i] >= nums[i]) {
                maxHere = maxHere + nums[i];
            } else {
                maxHere = nums[i];
            }
            if (maxHere > maxSum) {
                maxSum = maxHere;
            }
        }
        return maxSum;
    }

}
