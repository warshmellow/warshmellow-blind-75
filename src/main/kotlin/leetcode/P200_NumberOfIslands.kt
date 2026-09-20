package leetcode

/**
 * Challenge: Number of Islands (medium)
 * Link: https://leetcode.com/problems/number-of-islands
 */
object P200_NumberOfIslands {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun numIslands(grid: Array<CharArray>): Int {
            var total = 0
            for (i in grid.indices) {
                for (j in grid[0].indices) {
                    if (grid[i][j] == '1') {
                        dfs(grid, i, j)
                        total++
                    }
                }
            }
            return total
        }

        private fun dfs(grid: Array<CharArray>, i: Int, j: Int) {
            if (i !in grid.indices || j !in grid[0].indices || grid[i][j] == '0') return

            grid[i][j] = '0'

            dfs(grid, i + 1, j)
            dfs(grid, i - 1, j)
            dfs(grid, i, j + 1)
            dfs(grid, i, j - 1)
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
