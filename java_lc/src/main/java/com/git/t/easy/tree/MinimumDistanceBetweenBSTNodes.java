package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class MinimumDistanceBetweenBSTNodes {

  int min = Integer.MAX_VALUE;
  Integer prev = null;

  public int minDiffInBST(TreeNode root) {
    return helper(root);
  }


  private int helper(TreeNode node) {
    if (node == null) {
      return min;
    }
    helper(node.left);

    if (prev != null) {
      min = Math.min(min, node.val - prev);
    }
    prev = node.val;
    helper(node.right);

    return min;

  }
}
