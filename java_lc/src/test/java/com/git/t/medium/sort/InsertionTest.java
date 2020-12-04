package com.git.t.medium.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.ListNode;
import org.junit.jupiter.api.Test;

class InsertionTest {

  @Test
  void insertionSortList() {
    Insertion insertion = new Insertion();
    ListNode listNode = new ListNode(3);
    ListNode se = new ListNode(1);
    listNode.next = se;
    assertEquals(se.val, insertion.insertionSortList(listNode).val);
  }
}