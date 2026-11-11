package leetcode

/**
 * Challenge: Non-overlapping Intervals (medium)
 * Link: https://leetcode.com/problems/non-overlapping-intervals
 */
object P435_NonOverlappingIntervals {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
            intervals.sortWith(compareBy({ it[0] }, { it[1] }))
            val n = intervals.size

            if (n == 1) {
                return 0
            }

            var prevEnd = intervals[0][1]
            var total = 0

            for (i in 1..<n) {
                val curr = intervals[i]
                val currStart = curr[0]
                val currEnd = curr[1]

                val overlaps = prevEnd > currStart

                if (!overlaps) {
                    prevEnd = currEnd
                } else if (prevEnd <= currEnd) {
                    total++

                } else {
                    prevEnd = currEnd
                    total++
                }
            }

            return total
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
        println(
            solution.eraseOverlapIntervals(
                arrayOf(
                    intArrayOf(1, 2),
                    intArrayOf(1, 2),
                )
            )
        )
    }
}
