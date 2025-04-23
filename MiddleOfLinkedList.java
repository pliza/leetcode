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

class MiddelOfLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) { 
            return head;
        }
        int length = 1;
        ListNode next = head.next;
        while(next!= null) { 
            next = next.next; 
            length += 1; 
        }
        int startIndex = length /2 + 1; 

        ListNode toRet = head;
        for(int i = 1; i < startIndex; i ++) { 
            toRet = toRet.next; 
        }
        return toRet;
    }
}