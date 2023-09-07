package binarysearch

fun main(args: Array<String>) {
    val nums: IntArray = intArrayOf(-1, 0, 3, 5, 9, 12)
    val target = 9
    print(search(nums, target))
}

private fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        if (nums[mid] == target) {
            return mid
        }
        if (nums[mid] > target) {
            right = mid - 1
        }
        if (nums[mid] < target) {
            left = mid + 1
        }
    }
    return -1
}