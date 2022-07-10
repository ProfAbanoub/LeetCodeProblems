class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        var result = dividend / divisor
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE
        return result
    }
}