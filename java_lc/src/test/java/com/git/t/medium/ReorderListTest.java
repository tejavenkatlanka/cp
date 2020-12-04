package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.git.t.common.ListNode;
import org.junit.jupiter.api.Test;

class ReorderListTest {

  @Test
  void reorderList() {
    ReorderList reorderList = new ReorderList();
    ListNode head = new ListNode(1);
    ListNode seco = new ListNode(2);
    head.next = seco;
    reorderList.reorderList(head);
    assertNotNull(head);
  }
}