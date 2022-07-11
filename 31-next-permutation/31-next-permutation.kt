class Solution {
    fun nextPermutation(nums: IntArray): IntArray {
        val n = nums.size
        var index = -1
        for (i in n - 1 downTo 1) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1
                break
            }
        }

        if (index == -1) {
            reverse(nums, 0, n - 1)
            return nums
        }
        
        var j = n - 1
        for (i in n - 1 downTo index + 1) {
            if (nums[i] > nums[index]) {
                j = i
                break
            }
        }
        swap(nums, index, j)
        reverse(nums, index + 1, n - 1)
        return nums
    }

    private fun reverse(nums: IntArray, i: Int, j: Int) {
        var iIndex = i
        var jIndex = j
        while (iIndex < jIndex) {
            swap(nums, iIndex, jIndex)
            iIndex++
            jIndex--
        }
    }

    private fun swap(nums: IntArray, i: Int, index: Int) {
        val temp = nums[index]
        nums[index] = nums[i]
        nums[i] = temp
    }
}