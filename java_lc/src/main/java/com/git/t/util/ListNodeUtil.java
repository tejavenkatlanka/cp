package com.git.t.util;

import com.git.t.common.ListNode;
import java.util.Iterator;
import java.util.List;

public class ListNodeUtil {

  public ListNodeUtil() {
  }

  public static ListNode of(List<Integer> integers) {
    if (integers == null) {
      return null;
    } else {
      ListNode dummy = new ListNode();
      ListNode pre = dummy;

      for (Iterator var3 = integers.iterator(); var3.hasNext(); pre = pre.next) {
        Integer val = (Integer) var3.next();
        pre.next = new ListNode(val);
      }

      return dummy.next;
    }
  }

  public static boolean orderMatch(List<Integer> integers, ListNode node) {
    if (integers == null) {
      return node == null;
    } else {
      ListNode dummy = new ListNode();

      for (Iterator var4 = integers.iterator(); var4.hasNext(); node = node.next) {
        Integer integer = (Integer) var4.next();
        if (node == null || integer != node.val) {
          return false;
        }
      }

      return node == null;
    }
  }
}