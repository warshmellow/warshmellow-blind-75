package leetcode

/**
 * Challenge: Climbing Stairs (easy)
 * Link: https://leetcode.com/problems/climbing-stairs
 */
object P70 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun climbStairs(n: Int): Int = when (n) {
            1 -> 1
            2 -> 2
            else -> {
                var first = 1
                var second = 2

                for (i in 3..n) {
                    val tmp = first + second
                    first = second
                    second = tmp
                }
                second
            }
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
