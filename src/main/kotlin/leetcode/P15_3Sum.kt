package leetcode

/**
 * Challenge: 3Sum (medium)
 * Link: https://leetcode.com/problems/3sum
 */
object P15_3Sum {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun threeSum(nums: IntArray): List<List<Int>> {

            /*
            main idea: if you're given nums[i] and nums[j], nums[k] = - nums[i] - nums[j]
            sort nums so you can use binary search
            fix i, then find j < k meeting criteria use two pointer
            That is, fix j = i + 1, k = n - 1 and use two pointer;
            increment j and decrement k as needed
             */
            val n = nums.size
            nums.sort()

            val result = HashSet<ArrayList<Int>>()

            for (i in 0 until n - 1) {
                var j = i + 1
                var k = n - 1

                val ni = nums[i]

                while (j < k) {
                    val nj = nums[j]
                    val nk = nums[k]

                    val total = ni + nj + nk

                    if (total == 0) {
                        val found = arrayListOf<Int>(ni, nj, nk)
                        result.add(found)
                        j++
                        k--
                    } else if (total < 0) {
                        j++
                    } else {
                        k--
                    }
                }

            }

            return result.toList()
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
