package leetcode

/**
 * Challenge: Valid Parentheses (easy)
 * Link: https://leetcode.com/problems/valid-parentheses
 */
object P20 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun isValid(s: String): Boolean {
            val stack = ArrayDeque<Char>()
            for (c in s) {
                if (stack.isEmpty() && (c == ')' || c == ']' || c == '}')) {
                    return false
                } else if (c == ')' && stack.last() == '(') {
                    stack.removeLast()
                } else if (c == ']' && stack.last() == '[') {
                    stack.removeLast()
                } else if (c == '}' && stack.last() == '{') {
                    stack.removeLast()
                } else {
                    stack.addLast(c)
                }
            }
            return stack.isEmpty()
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
