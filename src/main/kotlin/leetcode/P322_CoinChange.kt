package leetcode

import kotlin.math.min


/**
 * Challenge: Coin Change (medium)
 * Link: https://leetcode.com/problems/coin-change
 */
object P322_CoinChange {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun coinChange(coins: IntArray, amount: Int): Int {
            val h = HashMap<Int, Int>()
            val result = dfs(h, coins, amount)

            return if (result == Int.MAX_VALUE) -1 else result
        }

        fun dfs(h: HashMap<Int, Int>, coins: IntArray, amount: Int): Int {
            if (amount == 0) return 0
            else if (amount < 0) return -1

            if (amount in h) {
                return h[amount]!!
            }

            var result = Int.MAX_VALUE

            for (coin in coins) {
                val res = dfs(h, coins, amount - coin)
                if (res != -1 && res != Int.MAX_VALUE) {
                    result = min(result, 1 + res)
                }
            }

            h[amount] = result

            return result

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
        println(solution.coinChange(intArrayOf(1, 5, 10), 12))
        println(solution.coinChange(intArrayOf(2), 3))
        println(solution.coinChange(intArrayOf(1), 0))

    }
}
