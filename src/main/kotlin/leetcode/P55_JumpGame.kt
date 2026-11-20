package leetcode

/**
 * Challenge: Jump Game (medium)
 * Link: https://leetcode.com/problems/jump-game
 */
object P55_JumpGame {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun canJump(nums: IntArray): Boolean {
            val n = nums.size
            var goal = n - 1

            for (i in (n - 2) downTo 0) {
                val ni = nums[i]
                val canReachGoal = ni + i >= goal
                if (canReachGoal) {
                    goal = i
                }
            }

            return goal == 0
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
        println(solution.canJump(intArrayOf(2, 3, 1, 1, 4)))
        println(!solution.canJump(intArrayOf(3, 2, 1, 0, 4)))
        println(!solution.canJump(intArrayOf(1, 2, 1, 0, 1)))
    }
}
