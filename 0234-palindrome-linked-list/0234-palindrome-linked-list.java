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
        // Stack<Integer> st = new Stack<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     st.push(temp.val);
        //     temp = temp.next;
        // }
        // temp =head;
        // while(temp!=null){
        //     if(temp.val != st.peek()){
        //         return false;
        //     }
        //     temp=temp.next;
        //     st.pop();
        // }
        // return true;
        // Finding middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse
        ListNode newHead = reverseList(slow.next);

        // Comparing
        ListNode first = head;
        ListNode second = newHead;

        while(second!=null){
            if(first.val!=second.val){
                reverseList(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    static ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev = null;
    while(temp!=null){
        ListNode front = temp.next;
        temp.next= prev;
        prev = temp;
        temp = front;
    }
    return prev;
}
}