package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.git.t.common.Node;
import org.junit.jupiter.api.Test;

class DeepCopyTest {

  @Test
  void copyRandomList() {
    Node head = new Node(2);
    DeepCopy deepCopy = new DeepCopy();
    Node res = deepCopy.copyRandomList(head);
    assertNotEquals(res, head);
    assertEquals(res.next, head.next);

  }
}