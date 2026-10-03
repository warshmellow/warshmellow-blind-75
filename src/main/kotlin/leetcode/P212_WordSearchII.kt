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
                    val nextNode = trie.root.children[board[i][j]]
                    if (nextNode != null) {
                        dfs2(board, nextNode, i, j, result)
                    }
                }
            }

            return result
        }

        fun dfs2(board: Array<CharArray>, currNode: TrieNode, i: Int, j: Int, result: MutableList<String>) {
            if (currNode.word != null) {
                result.add(currNode.word!!)
                currNode.word = null
            }

            val originalChar = board[i][j]

            board[i][j] = '#'

            val dirs = arrayOf(
                Pair(-1, 0), // Up
                Pair(1, 0),  // Down
                Pair(0, -1), // Left
                Pair(0, 1)   // Right
            )

            for ((di, dj) in dirs) {
                val r = i + di
                val c = j + dj

                if (r in 0 until board.size && c in 0 until board[0].size) {

                    val nextNode = currNode.children[board[r][c]]
                    if (nextNode != null) {
                        dfs2(board, nextNode, r, c, result)
                    }
                }
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
