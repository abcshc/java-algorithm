package com.example.javaalgorithm.leetcode;

import com.example.javaalgorithm.leetcode.object.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        boolean hasCarry = false;
        while (l1 != null || l2 != null) {
            int val1 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            int val2 = 0;
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            if (hasCarry) {
                val1++;
            }
            if (val1 + val2 >= 10) {
                hasCarry = true;
                currentNode.next = new ListNode(val1 + val2 - 10);
            } else {
                hasCarry = false;
                currentNode.next = new ListNode(val1 + val2);
            }

            currentNode = currentNode.next;
        }

        if (hasCarry) {
            currentNode.next = new ListNode(1);
        }

        return head.next;
    }
}
