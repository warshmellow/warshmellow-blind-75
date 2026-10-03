package leetcode

data class TrieNode(
    val children: HashMap<Char, TrieNode> = HashMap(),
    var isEnd: Boolean = false
)