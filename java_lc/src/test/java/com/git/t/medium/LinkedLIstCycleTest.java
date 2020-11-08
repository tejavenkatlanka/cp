package com.git.t.medium;

import com.git.t.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedLIstCycleTest {

    @Test
    void detectCycle() {
        LinkedLIstCycle lIstCycle=new LinkedLIstCycle();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2,head);
        assertEquals(head,lIstCycle.detectCycle(head));
    }
}