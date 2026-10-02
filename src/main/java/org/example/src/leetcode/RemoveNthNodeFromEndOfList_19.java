package org.example.src.leetcode;

public class RemoveNthNodeFromEndOfList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        // 1. Move 'fast' n steps forward.
        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // 2. Move both forward together until 'fast' reaches the last node.
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // 3. at the node preceding the node to be removed with a slow transition
        ListNode removedNode = slow.next;
        slow.next = removedNode.next;
        removedNode.next = null;

        return dummy.next;
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }