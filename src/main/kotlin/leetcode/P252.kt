package leetcode

/**
 * Challenge: Meeting Rooms (easy)
 * Link: https://leetcode.com/problems/meeting-rooms
 */
object P252 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun canAttendMeetings(intervals: Array<IntArray>): Boolean {
            val intervalsAsPairs = intervals.map { Pair(it[0], it[1]) }
                .sortedBy { it.first }

            for (i in 1 until intervalsAsPairs.size) {
                val curr = intervalsAsPairs[i]
                val prev = intervalsAsPairs[i - 1]
                if (curr.first < prev.second) return false
            }
            return true
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
