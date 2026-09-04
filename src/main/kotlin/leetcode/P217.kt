package leetcode

/**
 * Challenge: Contains Duplicate (easy)
 * Link: https://leetcode.com/problems/contains-duplicate
 */
object P217 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun containsDuplicate(nums: IntArray): Boolean {
            val counts = hashMapOf<Int, Int>()
            for (num in nums) {
                counts[num] = counts.getOrDefault(num, 0) + 1
            }
            for ((num, count) in counts) {
                if (count >= 2) return true
            }
            return false
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
