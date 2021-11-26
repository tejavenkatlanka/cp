package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;

public class DeleteNodeInBST {

  public TreeNode deleteNode(TreeNode root, int key) {

    if (root == null) {
      return null;
    }

    if (root.val > key) {
      root.left = deleteNode(root.left, key);
      return root;
    } else if (root.val < key) {
      root.right = deleteNode(root.right, key);
      return root;
    } else {
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      } else {
        TreeNode node =findMin(root.right);
        root.val= node.val;
        root.right=deleteNode(root.right, root.val);
      }
    }
    return root;

  }

  private TreeNode findMin(TreeNode node) {
    while (node.left != null) {
      node = node.left;
    }
    return node;
  }
}
