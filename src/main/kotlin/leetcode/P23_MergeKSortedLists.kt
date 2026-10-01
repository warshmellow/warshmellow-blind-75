package leetcode

/**
 * Challenge: Merge k Sorted Lists (hard)
 * Link: https://leetcode.com/problems/merge-k-sorted-lists
 */
object P23_MergeKSortedLists {

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
        fun mergeKLists(lists: Array<ListNode?>): ListNode? {
            if (lists.isEmpty()) return null

            var result = lists[0]
            for (i in 1 until lists.size) {
                result = mergeTwoLists(result, lists[i])
            }

            return result
        }

        fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
            if (l1 == null) return l2
            if (l2 == null) return l1

            val dummy = ListNode(0)
            var curr = dummy
            var curr1 = l1
            var curr2 = l2

            while (curr1 != null && curr2 != null) {
                if (curr1.`val` <= curr2.`val`) {
                    curr.next = curr1
                    curr1 = curr1.next
                } else {
                    curr.next = curr2
                    curr2 = curr2.next
                }
                curr = curr.next!!
            }

            curr.next = curr1 ?: curr2

            val head = dummy.next
            return head
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
