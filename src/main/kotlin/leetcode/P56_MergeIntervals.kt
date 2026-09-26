package leetcode

import kotlin.math.max

/**
 * Challenge: Merge Intervals (medium)
 * Link: https://leetcode.com/problems/merge-intervals
 */
object P56_MergeIntervals {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun merge(intervals: Array<IntArray>): Array<IntArray> {
            intervals.sortWith(compareBy<IntArray> { it[0] }.thenBy { it[1] })

            val updatedIntervals = ArrayList<IntArray>()

            var lastAppended = intervals[0]
            updatedIntervals.add(lastAppended)

            for (i in 1 until intervals.size) {
                val currentInterval = intervals[i]
                if (overlap(lastAppended, currentInterval)) {
                    lastAppended[1] = max(lastAppended[1], currentInterval[1])
                } else {
                    updatedIntervals.add(currentInterval)
                    lastAppended = currentInterval
                }
            }

            return updatedIntervals.toTypedArray()
        }

        private fun overlap(p1: IntArray, p2: IntArray): Boolean {
            return p2[0] <= p1[1]
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
