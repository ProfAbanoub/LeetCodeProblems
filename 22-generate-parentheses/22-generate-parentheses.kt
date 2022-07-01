class Solution {
    var res = ArrayList<String>()
    fun generateParenthesis(n: Int): List<String> {
        var path = StringBuilder()
        dfs(n, path, n, n)
        return res
    }
    
    fun dfs(n: Int, path: StringBuilder, left: Int, right: Int) {
        if (left == 0 && right == 0) {
            res.add(path.toString())
            return
        }
        
        if (left > right) return
        
        if (left > 0) {
            path.append("(")
            dfs(n,path, left - 1, right)
            path.deleteCharAt(path.length - 1)
        }
        
        if (right > 0) {
            path.append(")")
            dfs(n, path, left, right - 1)
            path.deleteCharAt(path.length - 1)
        }
    }
}