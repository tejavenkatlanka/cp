package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class SecondMinNode {

  public int findSecondMinimumValue(TreeNode root) {
    if (root.left == null) {
      return -1;
    }
    int l = root.val == root.left.val ? findSecondMinimumValue(root.left) : root.left.val;
    int r = root.val == root.right.val ? findSecondMinimumValue(root.right) : root.right.val;

    return (l == -1 || r == -1) ? Math.max(l, r) : Math.min(l, r);

  }

  public int findSecondMinimumValueBsf(TreeNode root) {
    Queue<TreeNode> treeNodes = new LinkedList<>();
    treeNodes.add(root);
    int second = Integer.MAX_VALUE;

    while (!treeNodes.isEmpty()) {
      TreeNode node = treeNodes.poll();
      if (node.left != null) {
        treeNodes.add(node.left);
      }
      if (node.right != null) {
        treeNodes.add(node.right);
      }
      if (node.val != root.val) {
        if (second == Integer.MAX_VALUE) {
          second = node.val;
        } else {
          second = Math.min(second, node.val);
        }
      }
    }
    return second == Integer.MAX_VALUE ? -1 : second;
  }
}
