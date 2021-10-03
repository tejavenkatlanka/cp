package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;

public class BinaryTree {

  TreeNode ans, p, q;

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    this.p = p;
    this.q = q;

    helper(root);
    return ans;

  }

  private boolean helper(TreeNode currentNode) {
    if (currentNode == null) {
      return false;
    }

    int left = helper(currentNode.left) ? 1 : 0;
    int right = helper(currentNode.right) ? 1 : 0;

    int mid = (currentNode == p || currentNode == q) ? 1 : 0;

    if (left + mid + right >= 2) {
      this.ans = currentNode;
    }
    return (mid + left + right > 0);

  }

}
