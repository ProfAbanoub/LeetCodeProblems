class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {

    var result = mutableListOf<List<Int>>()

    fun dfs(currentSum: Int, currentIdx: Int, currentCombo: List<Int>) {

        if (currentSum == target) {
            result.add(currentCombo)
            return
        } else if (currentSum > target) {
            return
        }

        for (idx in currentIdx until candidates.size) {
            val testSum = currentSum + candidates[idx]
            val testCombo = currentCombo + candidates[idx]

            dfs(testSum, idx, testCombo)
        }
    }

    dfs(0, 0, listOf())

    return result
 }
}