/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun swapPairs(head: ListNode?): ListNode? {
        var pointer = head
        
        if (head == null || head.next == null) return head
        
        var current = head
        var prevNode = current
        var newHead = current.next
        
         while (current != null && current.next != null) {
            val temp = current.next.next
            val nextNode = current.next
            nextNode.next = current
            prevNode!!.next = nextNode
            current.next = temp
            prevNode = current
            current = temp
         }
        return newHead
    }
}