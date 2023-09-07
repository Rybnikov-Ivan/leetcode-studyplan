package binarysearch;

/**
 * 704. Binary Search
 */
public class A {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return -1;
    }
}
