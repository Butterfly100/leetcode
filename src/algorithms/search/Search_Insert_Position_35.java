package algorithms.search;

/**
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/description/
 */
public class Search_Insert_Position_35 {

    public static void main(String args[]) {
        int[] nums = {1, 3, 5, 6};
        System.out.print(searchInsert(nums, 5));
        System.out.print(searchInsert(nums, 2));
        System.out.print(searchInsert(nums, 7));
        System.out.print(searchInsert(nums, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}
