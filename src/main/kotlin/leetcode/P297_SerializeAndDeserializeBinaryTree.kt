package leetcode

/**
 * Challenge: Serialize and Deserialize Binary Tree (hard)
 * Link: https://leetcode.com/problems/serialize-and-deserialize-binary-tree
 */
object P297_SerializeAndDeserializeBinaryTree {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    /**
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */

    class Codec() {
        // Encodes a URL to a shortened URL.

        private val delimiter = ","
        private val nullMarker = "N"

        private fun buildString(node: TreeNode?, sb: StringBuilder) {
            if (node == null) {
                sb.append(nullMarker).append(delimiter)
                return
            }
            sb.append(node.`val`).append(delimiter)
            buildString(node.left, sb)
            buildString(node.right, sb)
        }


        fun serialize(root: TreeNode?): String {
            val sb = StringBuilder()
            buildString(root, sb)
            return sb.toString()
        }

        private fun buildTree(iterator: Iterator<String>): TreeNode? {
            if (!iterator.hasNext()) return null

            val value = iterator.next()
            if (value == nullMarker || value.isEmpty()) return null

            val node = TreeNode(value.toInt())
            node.left = buildTree(iterator)
            node.right = buildTree(iterator)

            return node
        }

        // Decodes your encoded data to tree.
        fun deserialize(data: String): TreeNode? {
            val tokens = data.split(delimiter)

            val iterator = tokens.iterator()
            return buildTree(iterator)
        }
    }

    /**
     * Your Codec object will be instantiated and called as such:
     * var ser = Codec()
     * var deser = Codec()
     * var data = ser.serialize(longUrl)
     * var ans = deser.deserialize(data)
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
