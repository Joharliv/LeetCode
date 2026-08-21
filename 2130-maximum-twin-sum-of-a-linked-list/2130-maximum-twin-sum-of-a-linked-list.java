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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

         ListNode curr = slow.next;
         ListNode prev = null;
         ListNode n = null;

         while(curr != null){
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
         }

         slow.next = prev;
         ListNode temp = head;
         int max = -1;

         while(prev != null){
            max = Math.max(max , temp.val + prev.val);

            temp= temp.next;
            prev = prev.next;
         }
         return max;
         
    }
}