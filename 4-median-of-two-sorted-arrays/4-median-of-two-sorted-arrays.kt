class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val n = nums1.size + nums2.size
        val merged = IntArray(n)
        var c1 = 0
        var c2 = 0
        for (i in 0 until n) {
            if (c1 < nums1.size && c2 < nums2.size) {
                if (nums1[c1] < nums2[c2]) {
                    merged[i] = nums1[c1]
                    c1++
                } else {
                    merged[i] = nums2[c2]
                    c2++
                }
            } else if (c1 == nums1.size) {
                merged[i] = nums2[c2]
                c2++
            } else {
                merged[i] = nums1[c1]
                c1++
            }
        }
        return if (n % 2 == 1) merged[n / 2].toDouble() else (merged[(n - 1) / 2] + merged[n / 2]) / 2.0
    }
}