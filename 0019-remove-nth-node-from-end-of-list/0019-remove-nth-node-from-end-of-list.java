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
        if(head == null || head.next == null)return null;

        int count = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            count++;
        }

        temp = head;
        ListNode prev = null;

        if(count == n){
            head = head.next;
            return head;
        }
        while(count != n){
            prev = temp;
            temp = temp.next;
            count--;
        }

        prev.next = temp.next;
        temp.next = null;

        return head;

    }
}