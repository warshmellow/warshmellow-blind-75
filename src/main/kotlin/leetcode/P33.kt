package leetcode

/**
 * Challenge: Search in Rotated Sorted Array (medium)
 * Link: https://leetcode.com/problems/search-in-rotated-sorted-array
 */
object P33 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun search(nums: IntArray, target: Int): Int {
            val n = nums.size
            var left = 0
            var right = n - 1

            if (n == 1 && nums[0] == target) {
                return 0
            } else if (n == 1) {
                return -1
            }

            while (left <= right) {
                val mid = left + (right - left) / 2

                val nleft = nums[left]
                val nmid = nums[mid]
                val nright = nums[right]

                val leftHalfSorted = nmid - nleft >= 0
                val rightHalfSorted = nright - nmid >= 0

                when {
                    // trick is to check which half is sorted
                    // either nums[left] <= nmid or nmid <= nums[right]
                    // then check which half actually has the target, maintaining
                    // the invariant nums[left] <= target <= nums[right]
                    // this is readily known in the sorted half
                    // but if not, then you choose the unsorted half
                    // and if both halves are sorted, great!

                    nmid == target -> {
                        return mid
                    }

                    leftHalfSorted && nleft <= target && target < nmid -> {
                        right = mid - 1
                    }

                    leftHalfSorted -> {
                        left = mid + 1
                    }

                    rightHalfSorted && nmid < target && target <= nright -> {
                        left = mid + 1
                    }

                    else -> {
                        right = mid - 1
                    }
                }
            }

            return -1
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
