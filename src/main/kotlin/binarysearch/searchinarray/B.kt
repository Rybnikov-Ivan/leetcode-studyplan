package binarysearch.searchinarray

/**
 * 35. Search Insert Position
 */
fun main() {
    val nums: Array<Int> = arrayOf(-1, 3, 5, 6)
    val target = 2
    print(searchInsert(nums, target))
}

private fun searchInsert(nums: Array<Int>, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2
        if (nums[mid] == target) {
            return mid
        }
        if (nums[mid] < target) {
            left = mid + 1
        }
        if (nums[mid] > target) {
            right = mid - 1
        }
    }
    return left
}