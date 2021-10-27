package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeafSimilarTrees {

  public boolean leafSimilar1(TreeNode root1, TreeNode root2) {
    Stack<TreeNode> treeNodes = new Stack<>();
    Stack<TreeNode> treeNodes1 = new Stack<>();
    treeNodes.add(root1);
    treeNodes1.add(root2);
    while (!treeNodes.isEmpty() && !treeNodes1.isEmpty()) {
      if (dsf(treeNodes) != dsf(treeNodes1)) {
        return false;
      }
    }
    return treeNodes.isEmpty() && treeNodes1.isEmpty();
  }

  private int dsf(Stack<TreeNode> treeNode) {
    while (true) {
      TreeNode node = treeNode.pop();
      if (node.right != null) {
        treeNode.push(node.right);
      }
      if (node.left != null) {
        treeNode.push(node.left);
      }
      if (node.left == null && node.right == null) {
        return node.val;
      }
    }
  }

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    if (root1 == null || root2 == null) {
      return root1 == root2;
    }
    List<Integer> nodes = getLeafNodes(root1);
    List<Integer> nodes2 = getLeafNodes(root2);
    if (nodes.size() != nodes2.size()) {
      return false;
    }
    for (int i = 0; i < nodes.size(); i++) {
      if (nodes.get(i) != nodes2.get(i)) {
        return false;
      }
    }
    return true;
  }

  private List<Integer> getLeafNodes(TreeNode root) {
    if (root == null) {
      return Arrays.asList();
    }
    List<Integer> leadNodes = new ArrayList<>();
    Stack<TreeNode> nodes = new Stack<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      TreeNode peek = nodes.pop();
      int size = nodes.size();
      if (peek.right != null) {
        nodes.add(peek.right);
      }
      if (peek.left != null) {
        nodes.add(peek.left);
      }

      if (size == nodes.size()) {
        leadNodes.add(peek.val);
      }
    }
    return leadNodes;


  }
}
