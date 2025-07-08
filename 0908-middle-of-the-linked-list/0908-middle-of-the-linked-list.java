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
    public ListNode middleNode(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        int count=0;

        // Count the no. of header in the linked list
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int mid = count/2 +1;
        temp=head;

        while(temp!=null){
            mid=mid-1;

            // check if the middle
            // position is reached

            if(mid ==0){
                // break act of the loop to return temp
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}