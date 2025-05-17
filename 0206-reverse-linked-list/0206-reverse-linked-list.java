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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        Stack<Integer> s = new Stack<>();
        while(temp!=null){
            s.push(temp.val);
            temp = temp.next;
        }

        temp = head;
        while(temp!=null){
            temp.val = s.peek();
            s.pop();
            temp = temp.next;
        }
    return head;
    }
}