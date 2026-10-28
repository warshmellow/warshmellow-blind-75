package leetcode

/**
 * Challenge: Longest Repeating Character Replacement (medium)
 * Link: https://leetcode.com/problems/longest-repeating-character-replacement
 */
object P424_LongestRepeatingCharacterReplacement {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun characterReplacement(s: String, k: Int): Int {
            val asciiSize = 128
            val h = IntArray(asciiSize) // char -> count in window
            var i = 0
            var j = 0
            var mx = 0
            var maxFreq = 0 // max freq of any char

            while (j < s.length) {
                // See char, increase count
                val charCode = s[j].code
                h[charCode]++

                // max freq of any char updated
                maxFreq = maxOf(maxFreq, h[charCode])

                // Why move i?
                var windowLength = j + 1 - i

                // What is violated by this window so that it needs to shrink?
                /*
                We take maxFreq because the min number of replacements
                is achieved by taking the maxFreq char and changing all the OTHER chars
                to that one.

                The window is too big if even with k changes, you don't get max freq
                 */

                val windowTooBig = windowLength - k > maxFreq

                if (windowTooBig) {
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
