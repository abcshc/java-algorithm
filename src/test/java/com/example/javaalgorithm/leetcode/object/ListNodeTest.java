package com.example.javaalgorithm.leetcode.object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {
    @Test
    void equals1() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        ListNode node21 = new ListNode(1);
        node21.next = new ListNode(2);
        node21.next.next = new ListNode(3);
        node21.next.next.next = new ListNode(4);
        node21.next.next.next.next = new ListNode(5);

        assertEquals(node11, node21);
    }

    @Test
    void equals2() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        ListNode node21 = new ListNode(1);
        node21.next = new ListNode(2);
        node21.next.next = new ListNode(3);
        node21.next.next.next = node14;

        assertEquals(node11, node21);
    }

    @Test
    void equals3() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        ListNode node21 = new ListNode(1);
        node21.next = new ListNode(2);
        node21.next.next = new ListNode(3);
        node21.next.next.next = new ListNode(5);

        assertNotEquals(node11, node21);
    }

    @Test
    void hashCode1() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        ListNode node21 = new ListNode(1);
        node21.next = new ListNode(2);
        node21.next.next = new ListNode(3);
        node21.next.next.next = new ListNode(4);
        node21.next.next.next.next = new ListNode(5);

        assertTrue(node11.hashCode() == node21.hashCode());
    }

    @Test
    void hashCode2() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        ListNode node21 = new ListNode(1);
        node21.next = new ListNode(2);
        node21.next.next = new ListNode(3);
        node21.next.next.next = node14;

        assertTrue(node11.hashCode() == node21.hashCode());
    }

    @Test
    void hashCode3() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        ListNode node21 = new ListNode(1);
        node21.next = new ListNode(2);
        node21.next.next = new ListNode(3);
        node21.next.next.next = new ListNode(5);

        assertTrue(node11.hashCode() != node21.hashCode());
    }

    @Test
    void toString1() {
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);
        ListNode node13 = new ListNode(3);
        ListNode node14 = new ListNode(4);
        ListNode node15 = new ListNode(5);
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;

        assertEquals("1,2,3,4,5", node11.toString());
    }

    @Test
    void toString2() {
        ListNode node21 = new ListNode(5);
        node21.next = new ListNode(4);
        node21.next.next = new ListNode(3);
        node21.next.next.next = new ListNode(2);
        node21.next.next.next.next = new ListNode(1);

        assertEquals("5,4,3,2,1", node21.toString());
    }
}