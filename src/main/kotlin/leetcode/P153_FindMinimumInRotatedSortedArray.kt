package leetcode

/**
 * Challenge: Find Minimum in Rotated Sorted Array (medium)
 * Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array
 */
object P153_FindMinimumInRotatedSortedArray {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun findMin(nums: IntArray): Int {
            val n = nums.size
            var l = 0
            var r = n - 1

            while (l < r) {
                val mid = l + (r - l) / 2
                val nl = nums[l]
                val nmid = nums[mid]
                val nr = nums[r]

                if (nmid > nr) {
                    l = mid + 1
                } else {
                    r = mid
                }
            }
            return nums[l]
        }
    }
//IMPORTANT!! Submit Code Region End(Do not remove this line)
//IMPORTANT!! Submit Code Region End(Do not remove this line)

    // Local Testing Area (Ignored by LeetCode during submission)
    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution()
        // Try your test cases here!
        println(solution.findMin(intArrayOf(3, 4, 5, 1, 2)))
        println(solution.findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)))
        println(solution.findMin(intArrayOf(11, 13, 15, 17)))
        println(solution.findMin(intArrayOf(3, 4, 5, 6, 1, 2)))
        println(solution.findMin(intArrayOf(2, 1)))

    }
}
