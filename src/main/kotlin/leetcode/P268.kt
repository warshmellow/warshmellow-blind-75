package leetcode

/**
 * Challenge: Missing Number (easy)
 * Link: https://leetcode.com/problems/missing-number
 */
object P268 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun missingNumber(nums: IntArray): Int {
            val countsMap = nums.asIterable().groupingBy { it }.eachCount()
            val n = nums.size

            for (i in 0 until n + 1) {
                if (!countsMap.containsKey(i)) {
                    return i
                }
            }
            return nums.last() + 1
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
