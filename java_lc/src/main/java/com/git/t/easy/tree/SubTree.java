package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class SubTree {

  public boolean isSubtree(TreeNode s, TreeNode t) {
    if (s == null || t == null) {
      return t == null;
    }
    //   TreeNode refNode = treeNode(s, t.val);
    return isMatched(s, t) || isSubtree(s.left, t) || isSubtree(s.right, t);
  }

  private boolean isMatched(TreeNode sNode, TreeNode tNode) {
    if (sNode == null || tNode == null) {
      return sNode == tNode;
    }
    return sNode.val == tNode.val && isMatched(sNode.left, tNode.left) && isMatched(sNode.right,
        tNode.right);
  }


  private TreeNode treeNode(TreeNode node, int val) {
    if (node == null) {
      return null;
    }
    if (node.val == val) {
      return node;
    }
    TreeNode left = treeNode(node.left, val);
    if (left != null) {
      return left;
    }
    return treeNode(node.right, val);
  }


}
