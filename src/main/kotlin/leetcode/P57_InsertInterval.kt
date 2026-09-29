package leetcode

import kotlin.math.max
import kotlin.math.min

/**
 * Challenge: Insert Interval (medium)
 * Link: https://leetcode.com/problems/insert-interval
 */
object P57_InsertInterval {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
            val n = intervals.size
            val result = ArrayList<IntArray>()
            var i = 0
            var start = newInterval[0]
            var end = newInterval[1]

            while (i < n && intervals[i][1] < start) {
                result.add(intervals[i])
                i++
            }

            while (i < n && intervals[i][0] <= end) {
                start = min(start, intervals[i][0])
                end = max(end, intervals[i][1])
                i++
            }
            result.add(intArrayOf(start, end))

            while (i < n) {
                result.add(intervals[i])
                i++
            }

            return result.toTypedArray()
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
