class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 0
        for (i in nums.indices) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[k++] = nums[i]
            }
        }
        return nums.copyOf(k).size
    }
}