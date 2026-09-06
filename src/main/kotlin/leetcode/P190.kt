package leetcode

/**
 * Challenge: Reverse Bits (easy)
 * Link: https://leetcode.com/problems/reverse-bits
 */
object P190 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun reverseBits(n: Int): Int {
            /*
            We initialize res to 0 and iterate through the bits of the given integer n.
            We extract the bit at the i-th position using ((n >> i) & 1).
            If it is 1, we set the corresponding bit in res at position (31 - i) using (res |= (1 << (31 - i))).
             */
            var res = 0

            for (i in 0..31) {
                val ithIs1 = (n shr i) and 1
                if (ithIs1 != 0) {
                    res = res or (1 shl (31 - i))
                }
            }

            return res
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
