package leetcode

/**
 * Challenge: Course Schedule (medium)
 * Link: https://leetcode.com/problems/course-schedule
 */
object P207_CourseSchedule {

//IMPORTANT!! Submit Code Region Begin(Do not remove this line)

    //IMPORTANT!! Submit Code Region Begin(Do not remove this line)
    class Solution {
        fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {

            // make graph
            val graph = List(numCourses) { mutableListOf<Int>() }

            for (prerequisite in prerequisites) {
                val (a, b) = prerequisite
                graph[b] += a
            }


            for (course in graph.indices) {
                if (!dfs(course, graph, hashSetOf())) return false
            }

            return true
        }

        fun dfs(course: Int, graph: List<MutableList<Int>>, path: MutableSet<Int>): Boolean {
            // 1. Base case: Check if course is already in the current recursion path
            // (Your code here)

            // 2. Add course to current path
            // (Your code here)

            // 3. Recursively visit all neighbors of this course
            // If any neighbor returns false, return false immediately
            // (Your code here)

            // 4. Backtrack: remove course from path
            // (Your code here)

            // 5. The Optimization: Clear neighbors so future DFS calls treat it as a dead end
            graph[course].clear()

            return true
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
