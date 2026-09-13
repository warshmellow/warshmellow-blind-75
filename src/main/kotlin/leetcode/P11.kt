package leetcode

/**
 * Challenge: Container With Most Water (medium)
 * Link: https://leetcode.com/problems/container-with-most-water
 */
object P11 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun maxArea(height: IntArray): Int {
            var maxWater = 0
            var left = 0
            var right = height.size - 1

            while (left <= right) {
                val width = right - left
                val area = width * minOf(height[left], height[right])

                maxWater = maxOf(maxWater, area)

                if (height[left] < height[right]) {
                    left++
                } else {
                    right--
                }
            }
            return maxWater
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
