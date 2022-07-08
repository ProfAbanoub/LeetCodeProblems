class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        var j = 0
        while (i < nums.size && j < nums.size) {
            if (nums[j] != `val`) {
                nums[i] = nums[j]
                i++
                j++
            } else {
                j++
            }
        }
        return i
    }
}