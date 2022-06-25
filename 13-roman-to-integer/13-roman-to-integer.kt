class Solution {
    fun romanToInt(s: String): Int {
        val map: HashMap<Char, Int> = HashMap()
          map['I'] = 1
          map['V'] = 5
          map['X'] = 10
          map['L'] = 50
          map['C'] = 100
          map['D'] = 500
          map['M'] = 1000
            
            var output = 0
            var i = 0
            while (i < s.length) {
                if (i < s.length -1 && map[s[i]]!! < map[s[i + 1]]!!) {
                    output += map[s[i + 1]]!! - map[s[i]]!!
                    i++
                } else output += map[s[i]]!!
                i++
            }
        return output
    }
}