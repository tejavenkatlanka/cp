package com.git.t.medium;

import com.git.t.common.Node;

public class PerfectBTConnect {

  public Node connectIt(Node root) {
    Node level = root;
    while (level != null) {
      Node cur = level;
      while (cur != null) {
        if (cur.left != null) {
          cur.left.next = cur.right;
        }
        if (cur.right != null && cur.next != null) {
          cur.right.next = cur.next.left;
        }
        cur = cur.next;
      }
      level = level.left;
    }
    return root;
  }

  public Node connect(Node root) {
    connectHelper(root, null);
    return root;
  }

  public void connectHelper(Node node, Node next) {
    if (node == null) {
      return;
    }
    node.next = next;
    connectHelper(node.left, node.right);
    connectHelper(node.right, node.next != null ? node.next.left : null);
  }
}
