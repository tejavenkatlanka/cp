package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class RangeSumofBST {

  public int rangeSumBST(TreeNode root, int low, int high) {
    int sum = 0;
    if (root == null) {
      return 0;
    }
    if (root.val < low) {
      return rangeSumBST(root.right, low, high);
    } else if (root.val > high) {
      return rangeSumBST(root.left, low, high);
    }

    return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
  }
}
