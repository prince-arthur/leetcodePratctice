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
        return recursiveReverseList(head,null);
    }

    private ListNode recursiveReverseList(ListNode head, ListNode newHead){
        if(null == head)   
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return recursiveReverseList(next, head);
    }
}