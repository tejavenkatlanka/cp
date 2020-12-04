package com.git.t.medium;

import com.git.t.common.TreeNode;

public class FlattenTree {

  private TreeNode prev = null;

  public void flatten(TreeNode root) {
    if (root != null) {
      flattenHelp(root, null);
    }
  }

  public void flattenv1(TreeNode root) {
    if (root == null) {
      return;
    }
    flatten(root.right);
    flatten(root.left);
    root.right = prev;
    root.left = null;
    prev = root;
  }

  public void flattenHelp(TreeNode node, TreeNode link) {

    if (node.left == null && node.right == null) {
      node.right = link;
      return;
    }
    if (node.right != null) {
      flattenHelp(node.right, link);
    } else if (node.right == null) {
      node.right = link;
    }
    if (node.left != null) {
      flattenHelp(node.left, node.right);
      node.right = node.left;
      node.left = null;
    }
  }
}
