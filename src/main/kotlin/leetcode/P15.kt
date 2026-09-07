package leetcode

/**
 * Challenge: 3Sum (medium)
 * Link: https://leetcode.com/problems/3sum
 */
object P15 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun threeSum(nums: IntArray): List<List<Int>> {
            /*
            main idea: if you're given nums[i] and nums[j], nums[k] = - nums[i] - nums[j]
            sort nums so you can use binary search
            fix i, then find j < k meeting criteria using binary search
             */
            nums.sort()
            val n = nums.size

            val resultSet = mutableSetOf<Triple<Int, Int, Int>>()

            for (i in 0 until n - 1) {
                var left = i + 1
                var right = n - 1

                val ni = nums[i]

                while (left < right) {
                    val nj = nums[left]
                    val nk = nums[right]

                    val total = ni + nj + nk

                    if (total == 0) {
                        resultSet.add(Triple(ni, nj, nk))
                        left++
                        right--
                    } else if (total < 0) {
                        // ni + nj + nk < 0
                        // so nj needs to increase
                        left++
                    } else {
                        // ni + nj + nk > 0
                        // so nk needs to decrease
                        right--
                    }
                }
            }

            return resultSet.map { listOf(it.first, it.second, it.third) }
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
