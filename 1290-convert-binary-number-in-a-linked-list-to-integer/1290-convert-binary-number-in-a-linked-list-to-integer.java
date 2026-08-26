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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int[] val = new int[31];
        int idx = 0;
        int bin = 0;
        int i =0;
        while(temp != null){
            val[idx] = temp.val;
            ++idx;
            temp = temp.next;
        }

        for(int k = 0;k<idx;k++){
            System.out.print(val[k]);
        }

        for(int k = idx-1;k>=0;k--){
            int digit = val[k];
            bin += digit*Math.pow(2 , i);
            System.out.println(bin);
            i++;
        }

        return bin;
    }
}