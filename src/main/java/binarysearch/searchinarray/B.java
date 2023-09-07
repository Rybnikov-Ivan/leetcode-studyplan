package binarysearch.searchinarray;

/**
 * 35. Search Insert Position
 */
public class B {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }

        return left;
    }
}
