package com.example.javaalgorithm.leetcode;

import com.example.javaalgorithm.leetcode.object.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void case1() {
        ListNode answer = new ListNode(7);
        answer.next = new ListNode(0);
        answer.next.next = new ListNode(8);

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        assertEquals(answer, addTwoNumbers.addTwoNumbers(l1, l2));
    }

    @Test
    void case2() {
        ListNode answer = new ListNode(0);
        answer.next = new ListNode(0);
        answer.next.next = new ListNode(0);
        answer.next.next.next = new ListNode(0);
        answer.next.next.next.next = new ListNode(0);
        answer.next.next.next.next.next = new ListNode(0);
        answer.next.next.next.next.next.next = new ListNode(0);
        answer.next.next.next.next.next.next.next = new ListNode(0);
        answer.next.next.next.next.next.next.next.next = new ListNode(0);
        answer.next.next.next.next.next.next.next.next.next = new ListNode(0);
        answer.next.next.next.next.next.next.next.next.next.next = new ListNode(1);

        ListNode l1 = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next.next = new ListNode(9);

        assertEquals(answer, addTwoNumbers.addTwoNumbers(l1, l2));
    }

    @Test
    void case3() {
        ListNode answer = new ListNode(7);
        answer.next = new ListNode(3);

        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(3);

        assertEquals(answer, addTwoNumbers.addTwoNumbers(l1, l2));
    }


    @Test
    void case4() {
        ListNode answer = new ListNode(0);
        answer.next = new ListNode(1);

        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        assertEquals(answer, addTwoNumbers.addTwoNumbers(l1, l2));
    }
}