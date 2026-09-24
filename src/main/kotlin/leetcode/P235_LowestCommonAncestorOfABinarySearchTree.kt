package leetcode

/**
 * Challenge: Lowest Common Ancestor of a Binary Search Tree (medium)
 * Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 */
object P235_LowestCommonAncestorOfABinarySearchTree {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    /**
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int = 0) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */
    class Solution {
        fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
            // Safe check: if any are null, return root immediately
            if (root == null || p == null || q == null) return root

            val rootVal = root.`val`
            val pVal = p.`val` // No safe navigation (?.) needed due to smart casting above
            val qVal = q.`val`

            return when {
                pVal > rootVal && qVal > rootVal -> lowestCommonAncestor(root.right, p, q)
                pVal < rootVal && qVal < rootVal -> lowestCommonAncestor(root.left, p, q)
                else -> root
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
