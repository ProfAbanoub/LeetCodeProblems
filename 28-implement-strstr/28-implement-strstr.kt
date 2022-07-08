class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var ans = 0
        if (!haystack.contains(needle)) return -1
        if (haystack.contains(needle)) ans = ans + haystack.indexOf(needle)
        return ans
    }
}