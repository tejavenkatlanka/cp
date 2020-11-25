package com.git.t.medium;

import com.git.t.common.ListNode;

public class ReorderList {

  public void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      return;
    }
    ListNode start = head, slow = head, fast = head, pre = null;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      pre = slow;
      slow = slow.next;

    }
    pre.next = null;

    ListNode l2 = reverse(slow);

    merge(head, l2);
  }

  public void merge(ListNode l1, ListNode l2) {
    while (l1 != null) {
      ListNode n1 = l1.next, n2 = l2.next;
      l1.next = l2;

      if (n1 == null) {
        break;
      }
      l2.next = n1;
      l1 = n1;
      l2 = n2;
    }

  }

  public ListNode reverse(ListNode head) {
    ListNode start = null, cur = head, next = null;
    while (cur != null) {
      next = cur.next;
      cur.next = start;
      start = cur;
      cur = next;
    }
    return start;
  }
}
