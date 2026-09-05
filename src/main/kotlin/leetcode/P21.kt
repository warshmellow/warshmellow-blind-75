package leetcode

/**
 * Challenge: Merge Two Sorted Lists (easy)
 * Link: https://leetcode.com/problems/merge-two-sorted-lists
 */
object P21 {

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
        fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? =
            when {
                list1 == null -> list2
                list2 == null -> list1
                else -> {
                    val dummy = ListNode(0)
                    var current = dummy

                    var p1 = list1
                    var p2 = list2

                    while (p1 != null && p2 != null) {
                        if (p1.`val` <= p2.`val`) {
                            current.next = p1
                            p1 = p1.next
                        } else {
                            current.next = p2
                            p2 = p2.next
                        }
                        current = current.next!!
                    }

                    current.next = p1 ?: p2

                    dummy.next
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
