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
         if (head == null) {
            return null;
        }
        ListNode temp = head;
        int cnt=0;

        // Count the number of nodes in the linked list
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        
        // If N equals the total number of nodes, delete the head
        if(cnt ==n){
            ListNode newHead = head.next;
            head  = null;
            return newHead;
        }
        // Calculate the position of the node to delete (res)
        int res = cnt-n;
        temp = head;
        while(temp!=null){
            res--;
            if(res==0){
                break;
            }
            temp=temp.next;
        }
        ListNode delNode = temp.next;
        temp.next =  temp.next.next;
        return head;
    }
}