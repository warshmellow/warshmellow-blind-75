package leetcode

/**
 * Challenge: Two Sum (easy)
 * Link: https://leetcode.com/problems/two-sum
 */
object P1 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            for (i in nums.indices) {
                for (j in i + 1 until nums.size) {
                    if (nums[i] + nums[j] == target) return intArrayOf(i, j)
                }
            }
            return intArrayOf(0, 0)
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
        println(solution.twoSum(intArrayOf(0, 1, 2), 0).contentToString())
    }
}
