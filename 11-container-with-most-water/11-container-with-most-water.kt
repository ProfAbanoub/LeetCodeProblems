class Solution {
    fun maxArea(height: IntArray): Int {
        var max = 0
        var left = 0
        var right = height.size - 1
        
        while (left < right) {
            var width = right - left
            max = Math.max(max, Math.min(height[left], height[right]) * width)
            if (height[left] <= height[right]) {
                left++
            } else {
                right--
            }
        }
        return max
    }
}