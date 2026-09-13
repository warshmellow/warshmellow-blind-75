package leetcode

/**
 * Challenge: Longest Repeating Character Replacement (medium)
 * Link: https://leetcode.com/problems/longest-repeating-character-replacement
 */
object P424 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun characterReplacement(s: String, k: Int): Int {
            val asciiSize = 128
            val h = IntArray(asciiSize)
            var i = 0
            var j = 0
            var mx = 0
            var maxFreq = 0

            while (j < s.length) {
                val charCode = s[j].code

                h[charCode]++
                maxFreq = maxOf(maxFreq, h[charCode])

                var windowLength = j + 1 - i

                if (windowLength - maxFreq > k) {
                    h[s[i].code]--
                    i++
                    windowLength = j + 1 - i
                }

                mx = maxOf(mx, windowLength)
                j++
            }

            return mx
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
