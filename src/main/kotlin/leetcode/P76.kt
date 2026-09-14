package leetcode

/**
 * Challenge: Minimum Window Substring (hard)
 * Link: https://leetcode.com/problems/minimum-window-substring
 */
object P76 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun minWindow(s: String, t: String): String {
            if (s.length < t.length) return ""

            val asciiSize = 128
            val countT = IntArray(asciiSize)
            val window = IntArray(asciiSize)

            var uniqueCharsInT = 0
            for (i in 0 until t.length) {
                val charCode = t[i].code
                if (countT[charCode] == 0) uniqueCharsInT++
                countT[charCode]++
            }

            var have = 0
            val need = uniqueCharsInT

            var minLen = Int.MAX_VALUE
            var resRange = -1..-1

            var left = 0
            for (right in 0 until s.length) {
                val rChar = s[right].code
                window[rChar]++

                val existsInCountT = countT[rChar] > 0
                val windowHasSameCountChar = window[rChar] == countT[rChar]
                if (existsInCountT && windowHasSameCountChar) have++

                while (have == need) {
                    val currentWindowLen = right + 1 - left
                    if (currentWindowLen < minLen) {
                        minLen = currentWindowLen
                        resRange = left..right
                    }

                    val lChar = s[left].code
                    window[lChar]--

                    if (countT[lChar] > 0 && window[lChar] < countT[lChar]) {
                        have--
                    }
                    left++
                }
            }

            return if (minLen == Int.MAX_VALUE) {
                ""
            } else {
                s.substring(resRange)
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
