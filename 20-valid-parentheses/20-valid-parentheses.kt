class Solution {
    fun isValid(s: String): Boolean {
        val stack: Stack<Char> = Stack()
            for (element in s) {
                if (element == '(' || element == '[' || element == '{') stack.push(element)
                else if (element == ')' && !stack.isEmpty() && stack.peek() == '(') stack.pop()
                else if (element == ']' && !stack.isEmpty() && stack.peek() == '[') stack.pop()
                else if (element == '}' && !stack.isEmpty() && stack.peek() == '{') stack.pop()
                else return false
            }
        return stack.isEmpty()
    }
}