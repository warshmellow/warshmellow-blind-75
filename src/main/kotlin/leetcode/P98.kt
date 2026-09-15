package leetcode

/**
 * Challenge: Validate Binary Search Tree (medium)
 * Link: https://leetcode.com/problems/validate-binary-search-tree
 */
object P98 {

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
        fun isValidBST(root: TreeNode?): Boolean {
            return validate(root, Long.MIN_VALUE, Long.MAX_VALUE)
        }

        fun validate(node: TreeNode?, min: Long, max: Long): Boolean {
            if (node == null) return true

            val nodeVal = node.`val`.toLong()

            if (nodeVal !in (min + 1)..<max) return false

            return validate(node.left, min, nodeVal)
                    && validate(node.right, nodeVal, max)
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
