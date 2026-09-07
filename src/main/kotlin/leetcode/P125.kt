package leetcode

/**
 * Challenge: Valid Palindrome (easy)
 * Link: https://leetcode.com/problems/valid-palindrome
 */
object P125 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun isPalindrome(s: String): Boolean {
            val n = s.length

            var left = 0
            var right = n - 1

            while (left < right) {
                val lc = s[left]
                val rc = s[right]

                if (!lc.isLetterOrDigit()) {
                    left++
                } else if (!rc.isLetterOrDigit()) {
                    right--
                } else if (lc.equals(rc, ignoreCase = true)) {
                    left++
                    right--
                } else {
                    return false
                }
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
        println(solution.isPalindrome(" "))
        println(solution.isPalindrome("abba"))

    }
}
