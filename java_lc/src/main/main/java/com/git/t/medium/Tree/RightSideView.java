package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {

  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> response = new ArrayList<>();
    if (root == null) {
      return response;
    }
    Queue<TreeNode> treeNodes = new LinkedList<>();
    treeNodes.add(root);
    while (!treeNodes.isEmpty()) {
      int size = treeNodes.size();
      TreeNode node = null;
      for (int i = 0; i < size; i++) {
        node = treeNodes.poll();
        if (node.left != null) {
          treeNodes.add(node.left);
        }
        if (node.right != null) {
          treeNodes.add(node.right);
        }
      }
      response.add(node.val);

    }

    return response;
  }

  public List<Integer> rightSideViewre(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    dfs(root, 0, result);
    return result;
  }

  private void dfs(TreeNode root, int level, List<Integer> result) {
    if (root == null) {
      return;
    }

    if (level == result.size()) {
      result.add(root.val);
    }

    dfs(root.right, level + 1, result);
    dfs(root.left, level + 1, result);
  }
}
