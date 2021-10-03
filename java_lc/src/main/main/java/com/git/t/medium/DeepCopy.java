package com.git.t.medium;

import com.git.t.common.Node;

public class DeepCopy {

  public Node copyRandomList(Node head) {
    Node cur = head;
    Node next = null;
    while (cur != null) {
      next = cur.next;
      Node copy = new Node(cur.val);
      cur.next = copy;
      copy.next = next;
      cur = next;
    }
    cur = head;

    while (cur != null) {
      if (cur.random != null) {
        cur.next.random = cur.random.next;
      }
      cur = cur.next.next;

    }
    cur = head;
    Node re = new Node(0);
    Node copy = re, copyit = re;

    while (cur != null) {
      next = cur.next.next;
      copy.next = cur.next;
      copy = copy.next;
      cur.next = next;
      cur = next;
    }
    return re.next;
  }

  public Node copyRandomList1(Node head) {
    Node cur = head;

    while (cur != null) {
      Node node = new Node();
      node.val = cur.val;
      node.random = cur.random;
      cur.random = node;
      cur = cur.next;
    }
    cur = head;
    Node ret = head.random;
    while (cur != null) {

      Node random = cur.random.random;
      if (random != null) {
        cur.random.random = random.random;
        cur.random = random;
      }
      cur = cur.next;

    }
    return ret
        ;

  }
}
