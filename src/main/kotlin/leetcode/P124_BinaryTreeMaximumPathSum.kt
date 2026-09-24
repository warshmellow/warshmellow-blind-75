package leetcode

import kotlin.math.max

/**
 * Challenge: Binary Tree Maximum Path Sum (hard)
 * Link: https://leetcode.com/problems/binary-tree-maximum-path-sum
 */
object P124_BinaryTreeMaximumPathSum {

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
        private var maxPathSum = Int.MIN_VALUE

        fun maxPathSum(root: TreeNode?): Int {
            maxPathSum = Int.MIN_VALUE
            gainFromSubtree(root)
            return maxPathSum
        }

        private fun gainFromSubtree(root: TreeNode?): Int {
            if (root == null) return 0

            val leftGain = max(gainFromSubtree(root.left), 0)
            val rightGain = max(gainFromSubtree(root.right), 0)

            val currentPathSum = root.`val` + leftGain + rightGain

            maxPathSum = max(maxPathSum, currentPathSum)

            return root.`val` + max(leftGain, rightGain)
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
