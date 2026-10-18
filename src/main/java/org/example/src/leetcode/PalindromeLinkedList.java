package org.example.src.leetcode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode firstHalfEnd = middleNode(head);
        ListNode secondHalfBegin = reverseList(firstHalfEnd);

        ListNode left = head;
        ListNode right = secondHalfBegin;

        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    private ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode tmp = curr;
            curr = curr.next;
            tmp.next = prev;
            prev = tmp;
        }

        return prev;
    }
}
