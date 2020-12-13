package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;

public class CompleteTreeNode {

  public int countNodesIt(TreeNode root) {
    int nod = 0, height = height(root);

    while (root != null) {
      if (height(root.right) == height - 1) {
        nod += 1 << height;
        root = root.right;
      } else {
        nod += 1 << height - 1;
        root = root.left;
      }

    }
    return nod;
  }

  public int countNodes(TreeNode root) {
    int height = height(root);
    return height < 0 ? 0
        : height(root.right) == height - 1 ? (1 << height) + countNodes(root.right)
            : (1 << height - 1) + countNodes(root.left);
  }

  private int height(TreeNode node) {
    return (node == null) ? -1 : 1 + height(node.left);
  }
}
