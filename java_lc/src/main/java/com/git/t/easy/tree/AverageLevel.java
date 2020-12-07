package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevel {

  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> doubles = new ArrayList<>();
    Queue<TreeNode> treeNodes = new LinkedList<>();
    treeNodes.add(root);
    while (!treeNodes.isEmpty()) {
      int level = treeNodes.size();
      double sum = 0.0;
      for (int i = 0; i < level; i++) {
        TreeNode node = treeNodes.poll();
        sum += node.val;
        if (node.left != null) {
          treeNodes.offer(node.left);
        }
        if (node.right != null) {
          treeNodes.offer(node.right);
        }
      }
      doubles.add(sum / level);
    }
    return doubles;
  }
}
