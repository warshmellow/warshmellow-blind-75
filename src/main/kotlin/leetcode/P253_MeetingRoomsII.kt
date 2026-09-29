package leetcode

import kotlin.math.max

/**
 * Challenge: Meeting Rooms II (medium)
 * Link: https://leetcode.com/problems/meeting-rooms-ii
 */
object P253_MeetingRoomsII {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun minMeetingRooms(intervals: Array<IntArray>): Int {
            val start = ArrayList<Int>()
            val end = ArrayList<Int>()

            for (i in intervals.indices) {
                val startI = intervals[i][0]
                val endI = intervals[i][1]
                start.add(startI)
                end.add(endI)
            }

            start.sort()
            end.sort()

            var s = 0
            var e = 0
            var count = 0
            var result = 0

            while (s < start.size && e < end.size) {
                if (start[s] < end[e]) {
                    s++
                    count++
                } else {
                    e++
                    count--
                }
                result = max(result, count)

            }

            return result
        }
    }
//IMPORTANT!! Submit Code Region End(Do not remove this line)
//IMPORTANT!! Submit Code Region End(Do not remove this line)

    class Solution2 {
        fun minMeetingRooms(intervals: List<Interval>): Int {
            val solution = Solution()

            val params = intervals.map { intArrayOf(it.start, it.end) }.toTypedArray()
            return solution.minMeetingRooms(params)
        }
    }

    // Local Testing Area (Ignored by LeetCode during submission)
    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution()
        // Try your test cases here!
        // println(solution.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
    }
}
