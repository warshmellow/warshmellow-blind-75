package leetcode

/**
 * Challenge: 3Sum (medium)
 * Link: https://leetcode.com/problems/3sum
 */
object P15 {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun threeSum(nums: IntArray): List<List<Int>> {
            /*
            main idea: if you're given nums[i] and nums[j], nums[k] = - nums[i] - nums[j]
            So have map value -> indices with it
            then you have unique (nums[i], nums[j], nums[k])
            you need indices with it b/c make sure i != j != k

            Furthermore, you can sort the entire nums. While i,j,k will be out of order, their
            values will be sorted and each triple will be unique

             */
            nums.sort()

            val valuesToIndices = hashMapOf<Int, MutableList<Int>>()
            for ((index, value) in nums.withIndex()) {
                valuesToIndices.getOrPut(value) { mutableListOf() }.add(index)
            }

            val resultSet = mutableSetOf<Triple<Int, Int, Int>>()

            for (i in nums.indices) {
                for (j in i + 1 until nums.size) {
                    val ni = nums[i]
                    val nj = nums[j]
                    val nk = -ni - nj

                    val min = minOf(ni, nj, nk)
                    val max = maxOf(ni, nj, nk)
                    val mid = -min - max

                    val candidate = Triple(min, mid, max)

                    if (!resultSet.contains(candidate) && valuesToIndices[nk]?.find { it > j } != null) {
                        resultSet.add(candidate)
                    }
                }
            }

            return resultSet.toList().map { it.toList() }
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
