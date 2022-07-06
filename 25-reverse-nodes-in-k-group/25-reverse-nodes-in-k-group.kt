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
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if (head == null || k == 1) {
            return head
        }
        
        val dummy = ListNode(-1)
        dummy.next = head
        var previous = dummy
        var count = 0
        var current = head
        while (current != null) {
            count++
            if (count % k == 0) {
                previous = reverse(previous, current.next)
                current = previous.next
            } else {
                current = current.next
            }
        }
        return dummy.next
    }
    
        private fun reverse(start: ListNode, end: ListNode?): ListNode {
        val previous = start.next
        var current = previous!!.next
        var next: ListNode?
        while (current !== end) {
            next = current!!.next
            current.next = start.next
            start.next = current
            current = next
        }
        previous.next = end
        return previous
    }
}