class Solution {
    fun myAtoi(input: String): Int {
        var sign = 1
        var result = 0
        var index = 0
        val n = input.length

        while (index < n && input[index] == ' ') {
            index++
        }

        if (index < n && input[index] == '+') {
            sign = 1
            index++
        } else if (index < n && input[index] == '-') {
            sign = -1
            index++
        }

        while (index < n && Character.isDigit(input[index])) {
            val digit = input[index] - '0'

            if (result > Int.MAX_VALUE / 10 ||
                result == Int.MAX_VALUE / 10 && digit > Int.MAX_VALUE % 10
            ) {
                return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            }

            result = 10 * result + digit
            index++
        }

        return sign * result
    }
}