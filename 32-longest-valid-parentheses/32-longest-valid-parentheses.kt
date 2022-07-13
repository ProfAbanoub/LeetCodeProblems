class Solution {
    fun longestValidParentheses(s: String): Int {
    var count = 0
    var left = 0
    var right = 0
    for (element in s) {
        if (element == '(') {
            left++
        }
        if (element == ')') {
            right++
        }
        if (left == right) {
            count = count.coerceAtLeast(left + right)
        }
        if (right > left) {
            right = 0
            left = right
        }
    }
    
    right = 0
    left = right
    for (i in s.length - 1 downTo 0) {
        val c = s[i]
        if (c == '(') {
            left++
        }
        if (c == ')') {
            right++
        }
        if (left == right) {
            count = count.coerceAtLeast(left + right)
        }
        if (left > right) {
            right = 0
            left = right
        }
    }
    return count
  }
}