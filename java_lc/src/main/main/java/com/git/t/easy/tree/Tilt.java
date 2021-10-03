package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class Tilt {

  int sum = 0;

  public int findTilt(TreeNode root) {
    if (root == null) {
      return 0;
    }
    helper(root);
    return sum;
  }

  private int helper(TreeNode treeNode) {
    if (treeNode == null) {
      return 0;
    }
    int left = helper(treeNode.left);
    int right = helper(treeNode.right);
    sum += Math.abs(left - right);
    return treeNode.val;
  }
}
