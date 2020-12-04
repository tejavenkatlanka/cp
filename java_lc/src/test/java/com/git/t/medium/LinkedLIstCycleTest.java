package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.ListNode;
import org.junit.jupiter.api.Test;

class LinkedLIstCycleTest {

  @Test
  void detectCycle() {
    LinkedLIstCycle lIstCycle = new LinkedLIstCycle();
    ListNode head = new ListNode(1);
    head.next = new ListNode(2, head);
    assertEquals(head, lIstCycle.detectCycle(head));
  }
}