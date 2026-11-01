package leetcode

/**
 * Challenge: Minimum Window Substring (hard)
 * Link: https://leetcode.com/problems/minimum-window-substring
 */
object P76_MinimumWindowSubstring {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun minWindow(s: String, t: String): String {
            val m = s.length
            val n = t.length

            if (m < n) return ""

            val asciiSize = 128
            val countT = IntArray(asciiSize)
            val window = IntArray(asciiSize)

            var uniqueCharsInT = 0
            for (i in t.indices) {
                val charCode = t[i].code
                if (countT[charCode] == 0) {
                    uniqueCharsInT++
                }
                countT[charCode]++
            }

            var currentUniqueCharsSatisfied = 0
            val requiredUniqueCharsSatisfied = uniqueCharsInT

            var minLen = Int.MAX_VALUE
            var resultRange = -1..-1

            var left = 0
            for (right in 0 until s.length) {
                val rChar = s[right].code
                window[rChar]++

                val rCharInCountT = countT[rChar] > 0
                val windowHasSameCountRChar = window[rChar] == countT[rChar]
                if (rCharInCountT && windowHasSameCountRChar) currentUniqueCharsSatisfied++

                while (currentUniqueCharsSatisfied == requiredUniqueCharsSatisfied) {
                    val currentWindowLen = right + 1 - left

                    if (currentWindowLen < minLen) {
                        minLen = minOf(minLen, currentWindowLen)
                        resultRange = left..right
                    }

                    val lChar = s[left].code
                    window[lChar]--

                    val lCharInT = countT[lChar] > 0
                    if (lCharInT && window[lChar] < countT[lChar]) {
                        currentUniqueCharsSatisfied--
                    }
                    left++
                }
            }

            if (minLen == Int.MAX_VALUE) {
                return ""
            } else {
                return s.substring(resultRange)
            }
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
