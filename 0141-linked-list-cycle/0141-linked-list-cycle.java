/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Map<ListNode, Integer> nodeMap = new HashMap<>();

        // step: traverse the linked list
        while(temp!=null){
            // if the node is already in
            // the map there is a loop
            if(nodeMap.containsKey(temp)){
                return true;
            }

            // store the current node in the map
            nodeMap.put(temp,1);

            // move to the next node
            temp = temp.next;
        }
        return false;
    }
}