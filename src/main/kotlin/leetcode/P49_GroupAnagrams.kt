package leetcode


/**
 * Challenge: Group Anagrams (medium)
 * Link: https://leetcode.com/problems/group-anagrams
 */
object P49_GroupAnagrams {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun groupAnagrams(strs: Array<String>): List<List<String>> {

            val h = HashMap<List<Char>, ArrayList<String>>()

            for (s in strs) {
                val key = s.toList().sorted()
                h.getOrPut(key, { arrayListOf() }).add(s)
            }

            return h.values
                .map { it.toList() }
        }
    }
//IMPORTANT!! Submit Code Region End(Do not remove this line)
//IMPORTANT!! Submit Code Region End(Do not remove this line)

    data class TestCase(val strs: List<String>, val expected: List<List<String>>)

    // Local Testing Area (Ignored by LeetCode during submission)
    @JvmStatic
    fun main(args: Array<String>) {
        val solution = Solution()
        // Try your test cases here!
        // println(solution.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))

        val testCases = listOf(
            TestCase(
                listOf("eat", "tea", "tan", "ate", "nat", "bat"),
                listOf(listOf("bat"), listOf("nat", "tan"), listOf("ate", "eat", "tea"))
            ),
            TestCase(
                listOf(""),
                listOf(listOf(""))
            ),
            TestCase(
                listOf("a"),
                listOf(listOf("a"))
            )
        )

        for (testCase in testCases) {
            println(testCase)
            val computed = solution.groupAnagrams(testCase.strs.toTypedArray())
            println(computed)

        }
    }
}
