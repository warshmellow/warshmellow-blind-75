package leetcode

/**
 * Challenge: Word Search II (hard)
 * Link: https://leetcode.com/problems/word-search-ii
 */
object P212_WordSearchII {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
            val trie = Trie()

            for (word in words) {
                trie.insert(word)
            }

            val result = mutableListOf<String>()

            for (i in board.indices) {
                for (j in board[0].indices) {
                    for ((c, child) in trie.root.children) {
                        dfs(board, child, c, i, j, result)
                    }
                }
            }

            return result
        }

        fun dfs(board: Array<CharArray>, currNode: TrieNode, c: Char, i: Int, j: Int, result: MutableList<String>) {
            if (i < 0 || i >= board.size) return
            if (j < 0 || j >= board[0].size) return

            if (c != board[i][j]) return

            if (currNode.word != null) {
                result.add(currNode.word!!)
                currNode.word = null
            }

            val originalChar = board[i][j]

            board[i][j] = '#'

            for ((c, child) in currNode.children) {
                dfs(board, child, c, i - 1, j, result)
                dfs(board, child, c, i + 1, j, result)
                dfs(board, child, c, i, j - 1, result)
                dfs(board, child, c, i, j + 1, result)
            }

            board[i][j] = originalChar
        }
    }

    class Trie {
        val root = TrieNode()

        fun insert(word: String) {
            var curr = root
            for (c in word) {
                curr = curr.children.getOrPut(c) { TrieNode() }
            }
            curr.isEnd = true
            curr.word = word
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
        var isEnd: Boolean = false,
        var word: String? = null
    )
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
