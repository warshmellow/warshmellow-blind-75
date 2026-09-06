package leetcode

/**
 * Challenge: Linked List Cycle (easy)
 * Link: https://leetcode.com/problems/linked-list-cycle
 */
object P141 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    /**
     * Example:
     * var li = ListNode(5)
     * var v = li.`val`
     * Definition for singly-linked list.
     * class ListNode(var `val`: Int) {
     *     var next: ListNode? = null
     * }
     */

    class Solution {
        fun hasCycle(head: ListNode?): Boolean {
            var slow = head
            var fast = head

            while (fast?.next != null) {
                slow = slow?.next
                fast = fast.next?.next
                if (slow == fast) return true
            }
            return false
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
