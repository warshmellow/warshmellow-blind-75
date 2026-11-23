package leetcode

import kotlin.math.max

/**
 * Challenge: House Robber (medium)
 * Link: https://leetcode.com/problems/house-robber
 */
object P198_HouseRobber {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun rob(nums: IntArray): Int {
            val h = HashMap<Int, Int>()
            return dfs(nums, h, 0)
        }

        fun dfs(nums: IntArray, h: HashMap<Int, Int>, i: Int): Int {
            val n = nums.size
            if (i in 0..<n) {
                return h.getOrPut(
                    i,
                    { max(nums[i] + dfs(nums, h, i + 2), dfs(nums, h, i + 1)) }
                )
            } else {
                return 0
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
