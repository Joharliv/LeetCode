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
    public boolean isPalindrome(ListNode head) {
        if(head == null | head.next == null)return true;
        boolean palindrome = true;

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
        
        ListNode temp = head;

        while(prev != null){
            if(temp.val != prev.val) {
                palindrome = false;
            }

            temp = temp.next;
            prev = prev.next;
        }
        return palindrome;
    }
}