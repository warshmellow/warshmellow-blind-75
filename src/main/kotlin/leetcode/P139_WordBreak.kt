package leetcode

/**
 * Challenge: Word Break (medium)
 * Link: https://leetcode.com/problems/word-break
 */
object P139_WordBreak {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun wordBreak(s: String, wordDict: List<String>): Boolean {
            val h = HashMap<Int, Boolean>()
            return dfs(s, 0, wordDict, h)
        }

        fun dfs(s: String, i: Int, wordDict: List<String>, h: HashMap<Int, Boolean>): Boolean {
            val n = s.length
            if (i == n) {
                return true
            }

            for (j in i..<n) {
                val curr = s.substring(i..j)

                if (curr in wordDict && h.getOrPut(
                        j + 1,
                        { dfs(s, j + 1, wordDict, h) }
                    )
                ) {
                    return true
                }
            }

            return false
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
