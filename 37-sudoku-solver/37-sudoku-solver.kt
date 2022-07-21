class Solution {
    fun solveSudoku(board: Array<CharArray>): Unit{
        var i = 0
        var j = 0
        backTracking(board,i,j)
    }

    private fun backTracking(board: Array<CharArray>, i: Int, j: Int): Boolean{
        if(i > 8) {
            return true
        }
        var nextI = 0
        var nextJ = 0
        if (j == 8) {
            nextJ = 0
            nextI = i + 1
        } else {
            nextJ = j + 1
            nextI = i
        }

        if (board[i][j] == '.') {
            for (k in charArrayOf('1','2','3','4','5','6','7','8','9')) {
                if (!isValidSudoku(board,i,j,k)) continue
                board[i][j] = k
                if (backTracking(board,nextI,nextJ)) return true
                board[i][j] = '.' 
            }
            return false
        } else {
            if (backTracking(board,nextI,nextJ)) return true
        }
        return false
    }

    private fun isValidSudoku(board: Array<CharArray>, row: Int, col: Int, c: Char): Boolean {
        for (i in 0 until 9) {
            if (board[i][col] != '.' && board[i][col] == c) return false
            if (board[row][i] != '.' && board[row][i] == c) return false
            if (board[3 * (row/3) + i / 3][3 * (col/3) + i % 3] != '.' &&
                    board[3 * (row/3) + i / 3][3 * (col/3) + i % 3] == c) return false
        }
        return true
    }
}