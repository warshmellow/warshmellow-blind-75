package leetcode

/**
 * Challenge: Reverse Linked List (easy)
 * Link: https://leetcode.com/problems/reverse-linked-list
 */
object P206 {

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
        fun reverseList(head: ListNode?): ListNode? {
            val (newHead, _) = reverseListHeadAndTail(head)
            return newHead
        }

        fun reverseListHeadAndTail(head: ListNode?): Pair<ListNode?, ListNode?> =
            when {
                head == null -> Pair(null, null)
                head.next == null -> {
                    Pair(head, head)
                }

                else -> {
                    val (newHead, newTail) = reverseListHeadAndTail(head.next)
                    head.next = null
                    newTail?.next = head
                    Pair(newHead, head)
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
