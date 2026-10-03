package leetcode

/**
 * Challenge: Number of Connected Components in an Undirected Graph (medium)
 * Link: https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph
 */
object P323_NumberOfConnectedComponentsInAnUndirectedGraph {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun countComponents(n: Int, edges: Array<IntArray>): Int {

            val graph = Array(n) { ArrayList<Int>() }

            for (edge in edges) {
                val start = edge[0]
                val end = edge[1]

                graph[start].add(end)
                graph[end].add(start)
            }

            val seen = BooleanArray(n)

            var total = 0

            for (i in 0 until n) {
                if (!seen[i]) {
                    dfs(graph, i, seen)
                    total++
                }
            }

            return total
        }

        private fun dfs(graph: Array<ArrayList<Int>>, i: Int, seen: BooleanArray) {
            seen[i] = true

            for (k in graph[i]) {
                if (!seen[k]) {
                    dfs(graph, k, seen)
                }
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
