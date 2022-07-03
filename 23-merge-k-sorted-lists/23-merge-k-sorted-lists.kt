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
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val queue: Queue<Int> = PriorityQueue<Int> { x, y -> x - y }
        
        for (_node in lists) {
            var node = _node
            while (node != null) {
                queue.add(node.`val`)
                node = node.next
            }
        }
        var cur = ListNode(0)
        var list = cur
        while (!queue.isEmpty()) {
            cur.next = ListNode(queue.poll())
            cur = cur.next
        }
        return list.next
    }
}