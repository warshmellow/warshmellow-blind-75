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
            val newS = s.lowercase().filter { c -> c.isLetterOrDigit() }

            val n = newS.length
            val halfway = n / 2

            return if (n == 1) {
                true
            } else if (n % 2 == 0) {
                newS.substring(0, halfway) == newS.substring(halfway).reversed()
            } else {
                newS.substring(0, halfway) == newS.substring(halfway + 1).reversed()
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
        println(solution.isPalindrome(" "))
        println(solution.isPalindrome("abba"))

    }
}
