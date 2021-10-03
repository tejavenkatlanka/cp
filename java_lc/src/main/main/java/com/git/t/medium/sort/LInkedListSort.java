package com.git.t.medium.sort;


import com.git.t.common.ListNode;

public class LInkedListSort {

  public LInkedListSort() {
  }

  public ListNode sortList(ListNode head) {
    return this.mergeSort(head);
  }

  private ListNode mergeSort(ListNode node) {
    if (node != null && node.next != null) {
      ListNode pre = node;
      ListNode slow = node;

      for (ListNode fast = node; fast != null && fast.next != null; fast = fast.next.next) {
        pre = slow;
        slow = slow.next;
      }

      pre.next = null;
      ListNode left = this.mergeSort(node);
      ListNode right = this.mergeSort(slow);
      return this.merge(left, right);
    } else {
      return node;
    }
  }

  private ListNode merge(ListNode left, ListNode right) {
    ListNode dummy = new ListNode();

    ListNode app;
    for (app = dummy; left != null && right != null; app = app.next) {
      if (left.val < right.val) {
        app.next = left;
        left = left.next;
      } else {
        app.next = right;
        right = right.next;
      }
    }

    if (left != null) {
      app.next = left;
    }

    if (right != null) {
      app.next = right;
    }

    return dummy.next;
  }
}
