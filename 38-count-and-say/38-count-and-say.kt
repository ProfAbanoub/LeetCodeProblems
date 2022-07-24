class Solution {
    fun countAndSay(n: Int): String {
        if (n == 1) return "1"
        if (n == 2) return "11"

        var str = "11"
        var i = 3
        while (i <= n) {
            var workingStr = ""
            var count = 1
            var j = 0
            while (j < str.length - 1) {
                if (str[j] == str[j + 1]) {
                    count++
                } else {
                    workingStr += "$count${str[j]}"
                    count = 1
                }

                j++
            }
            workingStr += "$count${str[j]}"
            i++
            str = workingStr
        }
        return str
    }
}