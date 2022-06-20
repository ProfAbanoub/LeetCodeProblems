class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        var ans = 0
        
        val map: MutableMap<Char, Int> = HashMap()
        
        var j = 0
        var i = 0
        while(j < n) {
            if (map.containsKey(s[j])) {
                i = Math.max(map[s[j]]!!, i)
            }
            ans = Math.max(ans, j - i + 1)
            map[s[j]] = j + 1
            j++
        }
        return ans
    }
}