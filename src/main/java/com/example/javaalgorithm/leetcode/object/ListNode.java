package com.example.javaalgorithm.leetcode.object;

import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        String values = "";
        ListNode node = next;

        while (node != null) {
            values += node.val + ",";
            node = node.next;
        }

        return Objects.hash(values);
    }

    @Override
    public String toString() {
        String values = val + ",";
        ListNode node = next;

        while (node != null) {
            values += node.val + ",";
            node = node.next;
        }

        return values.substring(0, values.length() - 1);
    }
}
