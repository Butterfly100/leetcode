package algorithms.array;

/**
 * 27. Remove Element
 * https://leetcode.com/problems/remove-element/
 */
public class Remove_Element_27 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3,4,2,3};
        System.out.println(removeElement(nums, 5));
        for (int num : nums) {
            System.out.print(num + ", ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }


}
