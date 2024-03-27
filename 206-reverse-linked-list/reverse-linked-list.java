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
        // return recursiveReverseList(head,null);
        return iterativeReverseList(head);
    }

    private ListNode recursiveReverseList(ListNode head, ListNode newHead){
        if(null == head)   
            return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return recursiveReverseList(next, head);
    }

    private ListNode iterativeReverseList(ListNode head) {
        ListNode newHead = null;
        while(null!=head){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}