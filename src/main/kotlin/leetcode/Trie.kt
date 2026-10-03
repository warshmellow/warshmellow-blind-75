package leetcode

class Trie {
    private val root = TrieNode()

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