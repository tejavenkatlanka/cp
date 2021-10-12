package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;

public class RecoverBinarySearchTree {

  TreeNode node1 = null;
  TreeNode node2 = null;
  TreeNode pre = null;

  public void recoverTree(TreeNode root) {
    helper(root);
    int temp = node1.val;

    node1.val = node2.val;
    node2.val = temp;

  }

  private void helper(TreeNode node) {
    if (node == null) {
      return;
    }

    helper(node.left);

    if (node1 == null && (pre == null || pre.val >= node.val)) {
      node1 = pre;
    }
    if (node1 != null && pre.val >= node.val) {
      node2 = node;
    }
    pre = node;

    helper(node.right);

  }
}
