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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
       if(head.next == null){
        return new int[] {-1 , -1};
       }
        
        ListNode temp = head.next;
        ListNode prev = head;
        ListNode n = temp.next;
        int idx = 1;
        int mindiff = Integer.MAX_VALUE;
        int maxdiff = -1;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n != null){
            ++idx;
            if(temp.val > prev.val && temp.val > n.val){
                list.add(idx);
               
            }

            if(temp.val < prev.val && temp.val < n.val){
              list.add(idx);
            }

            prev = temp;
            temp = temp.next;
            n = temp.next;
        }

        if(list.size() < 2){
            return new int[] {-1, -1};
        }

           for(int i =1;i<list.size();i++){
             mindiff = Math.min(mindiff, list.get(i) - list.get(i-1));
           }
            
            maxdiff = list.get(list.size() - 1) - list.get(0);


       
        return new int[] {mindiff , maxdiff};
    }
}