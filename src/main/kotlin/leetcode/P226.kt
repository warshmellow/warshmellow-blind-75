package leetcode

/**
 * Challenge: Invert Binary Tree (easy)
 * Link: https://leetcode.com/problems/invert-binary-tree
 */
object P226 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    /**
     * Example:
     * var ti = TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */
    class Solution {
        fun invertTree(root: TreeNode?): TreeNode? = when {
            root?.left == null && root?.right == null -> root
            else -> {
                val invertedRight = invertTree(root.right)
                val invertedLeft = invertTree(root.left)
                root.left = invertedRight
                root.right = invertedLeft
                root
            }
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
