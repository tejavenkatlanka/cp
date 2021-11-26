package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class UnivaluedBinaryTree {

  public boolean isUnivalTree(TreeNode root) {
    return helper(root, root.val);
  }

  private boolean helper(TreeNode node, int val) {
    if (node == null) {
      return true;
    }
    return node.val == val && helper(node.left, val) && helper(node.right, val);
  }
}
