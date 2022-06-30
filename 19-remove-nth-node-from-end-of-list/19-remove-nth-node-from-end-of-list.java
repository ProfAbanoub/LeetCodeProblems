/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Prev = head;
        ListNode Last = head;
        int count = 0;
        while (Last != null) {
            count++;
            Last = Last.next;
        }
        
        if (count == 1) {
          head = null;
          return head;
        }
        
        int remove = count - n;
        int i = 1;
        if (remove <= 0) {
          head = head.next;
          return head;
        }
        
        while (i != remove) {
          Prev = Prev.next;
          i++;
        }
        
        ListNode Main = Prev.next;
        Prev.next = Main.next;
        return head;
    }
}