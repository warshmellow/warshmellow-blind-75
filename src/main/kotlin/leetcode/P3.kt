package leetcode

/**
 * Challenge: Longest Substring Without Repeating Characters (medium)
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
object P3 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun lengthOfLongestSubstring(s: String): Int {
            val inWindow = HashSet<Char>()
            var mx = 0
            var i = 0
            var j = 0

            while (j < s.length) {
                if (!inWindow.contains(s[j])) {
                    // If the character is unique, add it to the window
                    inWindow.add(s[j])
                    // Update the maximum length found so far
                    mx = maxOf(mx, j - i + 1)
                    j++
                } else {
                    // If it's a duplicate, shrink the window from the left
                    inWindow.remove(s[i])
                    i++
                }
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
