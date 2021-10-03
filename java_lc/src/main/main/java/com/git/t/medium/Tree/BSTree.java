package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;
import java.util.LinkedList;

public class BSTree {

  public int kthSmallest(TreeNode root, int k) {
    LinkedList<TreeNode> treeNodes = new LinkedList<>();
    while (true) {
      while (root != null) {
        treeNodes.add(root);
        root = root.left;

      }
      root = treeNodes.removeLast();
      if (--k == 0) {
        return root.val;
      }
      root = root.right;
    }
  }
}
