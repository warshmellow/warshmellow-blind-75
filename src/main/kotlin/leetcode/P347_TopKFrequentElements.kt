package leetcode

/**
 * Challenge: Top K Frequent Elements (medium)
 * Link: https://leetcode.com/problems/top-k-frequent-elements
 */
object P347_TopKFrequentElements {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun topKFrequent(nums: IntArray, k: Int): IntArray {
            val counts = nums.groupBy { it }
                .mapValues { it.value.size }

            val n = nums.size
            val freq = ArrayList<ArrayList<Int>>()
            for (i in 0 until n + 1) {
                freq.add(ArrayList())
            }

            for ((num, count) in counts) {
                freq[count].add(num)
            }

            val result = ArrayList<Int>()
            for (i in n downTo 1) {
                for (num in freq[i]) {
                    if (result.size < k) {
                        result.add(num)
                    } else {
                        break
                    }
                }
            }
            return result.toIntArray()
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
