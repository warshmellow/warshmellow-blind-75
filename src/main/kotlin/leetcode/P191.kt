package leetcode

/**
 * Challenge: Number of 1 Bits (easy)
 * Link: https://leetcode.com/problems/number-of-1-bits
 */
object P191 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun hammingWeight(n: Int): Int {
            var count = 0
            for (i in 31 downTo 0) {
                if ((1 shl i) and n != 0) {
                    count++
                }
            }
            return count
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
