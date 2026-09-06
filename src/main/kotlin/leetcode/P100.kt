package leetcode

/**
 * Challenge: Same Tree (easy)
 * Link: https://leetcode.com/problems/same-tree
 */
object P100 {

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
        fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean = when {
            p == null && q == null -> true
            p?.`val` != q?.`val` -> false
            else -> isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
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
