package com.git.t.easy;

import com.git.t.common.TreeNode;

public class CousinsInBinaryTree {

  TreeNode xParent = null;
  TreeNode yParent = null;
  int xDepth = 0;
  int yDepth = 0;

  public boolean isCousins(TreeNode root, int x, int y) {
    helper(root, x, y, 0, null);
    return xDepth == yDepth && xParent != yParent;
  }

  private void helper(TreeNode root, int x, int y, int i, TreeNode parent) {
    if (root == null) {
      return;
    }
    if (root.val == x) {
      xDepth = i;
      xParent = parent;
    } else if (root.val == y) {
      yDepth = i;
      yParent = parent;
    }
    helper(root.left, x, y, i + 1, root);
    helper(root.right, x, y, i + 1, root);

  }
}
