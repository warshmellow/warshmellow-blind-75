package leetcode

/**
 * Challenge: Valid Anagram (easy)
 * Link: https://leetcode.com/problems/valid-anagram
 */
object P242 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun isAnagram(s: String, t: String): Boolean {
            val sMap = sortedMapOf<Char, Int>()
            val tMap = sortedMapOf<Char, Int>()
            for (c in s) {
                sMap[c] = sMap.getOrDefault(c, 0) + 1
            }
            for (c in t) {
                tMap[c] = tMap.getOrDefault(c, 0) + 1
            }
            return sMap == tMap

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
        println(solution.isAnagram("anagram", "nagaram"))
    }
}
