package com.git.t.medium;

import com.git.t.common.Node;

public class BinaryTreeConnect {

  public Node connect(Node root) {
    connectHelper(root, null);
    return root;
  }

  public void connectHelper(Node node, Node nodeNext) {
    if (node == null) {
      return;
    }
    node.next = nodeNext;
    connectHelper(node.right, nodeNext == null ? null :
        next(node.next)
    );

    connectHelper(node.left, node.right == null ? (node.next == null ? null :
        next(node.next)
    ) : node.right);

  }

  public Node next(Node node) {
    while (node != null) {
      if (node.left != null) {
        return node.left;
      } else if (node.right != null) {
        return node.right;
      } else {
        node = node.next;
      }
    }
    return null;
  }

}
