package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class MergeBinaryTree {

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null || t2 == null) {
      return t1 == null ? deepCopy(t2) : deepCopy(t1);
    }
    TreeNode copy = new TreeNode(t1.val + t2.val);
    copy.left = mergeTrees(t1.left, t2.left);
    copy.right = mergeTrees(t1.right, t2.right);
    return copy;
  }


  private TreeNode deepCopy(TreeNode node) {
    if (node == null) {
      return null;
    }
    TreeNode clone = new TreeNode(node.val);
    clone.left = deepCopy(node.left);
    clone.right = deepCopy(node.right);
    return clone;
  }
}
