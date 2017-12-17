package algorithms.array;

/**
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Remove_Duplicates_from_Sorted_Array_26 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,2,2,2,4,4,4,4,5};
        System.out.println(removeDuplicates(nums));
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue;
            } else {
                index++;
                nums[index] = nums[i];
            }
        }
        return (index+1);
    }

}
