package leetcode

/**
 * Challenge: Search in Rotated Sorted Array (medium)
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array
 */
object P33_SearchInRotatedSortedArray {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun search(nums: IntArray, target: Int): Int {
            val n = nums.size
            var left = 0
            var right = n - 1

            while (left <= right) {
                val mid = left + (right - left) / 2
                val numsLeft = nums[left]
                val numsMid = nums[mid]
                val numsRight = nums[right]

                if (target == numsMid) {
                    return mid
                } else if (numsLeft <= numsMid && target in numsLeft..numsMid) {
                    right = mid - 1
                } else if (numsLeft <= numsMid) {
                    left = mid + 1
                } else if (target in numsMid..numsRight) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }

            return if (right > -1 && nums[right] == target) right else -1
        }
    }
//IMPORTANT!! Submit Code Region End(Do not remove this line)
//IMPORTANT!! Submit Code Region End(Do not remove this line)

    // Local Testing Area (Ignored by LeetCode during submission)
    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution()
        // Try your test cases here!
        // println(solution.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
    }
}
