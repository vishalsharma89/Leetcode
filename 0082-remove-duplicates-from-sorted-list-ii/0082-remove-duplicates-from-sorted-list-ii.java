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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr!=null){
            // if the current node is a duplicate
            if(curr.next!=null && curr.val ==curr.next.val){
                // move to the last duplicate node
                while(curr.next!=null && curr.val ==curr.next.val){
                    curr = curr.next;
                }
                // skip the duplicate node
                prev.next = curr.next;
            }else{
                // we have a unique node
                prev = prev.next;
            }
            //move to the next node
            curr = curr.next; 
        }
        return dummy.next;


    }
}