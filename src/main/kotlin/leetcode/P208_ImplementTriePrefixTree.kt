package leetcode

/**
 * Challenge: Implement Trie (Prefix Tree) (medium)
 * Link: https://leetcode.com/problems/implement-trie-prefix-tree
 */
object P208_ImplementTriePrefixTree {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Trie() {
        private val root = TrieNode()

        fun insert(word: String) {
            var curr = root
            for (c in word) {
                curr = curr.children.getOrPut(c) { TrieNode() }
            }
            curr.isEnd = true
        }

        fun search(word: String): Boolean {
            val node = findNode(word)
            return node != null && node.isEnd
        }

        fun startsWith(prefix: String): Boolean {
            return findNode(prefix) != null
        }

        private fun findNode(str: String): TrieNode? {
            var curr = root
            for (c in str) {
                curr = curr.children[c] ?: return null
            }
            return curr
        }

    }

    data class TrieNode(
        val children: HashMap<Char, TrieNode> = HashMap(),
        var isEnd: Boolean = false
    )

    class Solution

    /**
     * Your Trie object will be instantiated and called as such:
     * var obj = Trie()
     * obj.insert(word)
     * var param_2 = obj.search(word)
     * var param_3 = obj.startsWith(prefix)
     */
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
