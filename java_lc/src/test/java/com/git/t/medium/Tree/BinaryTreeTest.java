package com.git.t.medium.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

  @Test
  void lowestCommonAncestor() {
    BinaryTree binaryTree = new BinaryTree();

    TreeNode node = new TreeNode(2);
    TreeNode right = new TreeNode(1);
    node.right = right;
    assertEquals(node, binaryTree.lowestCommonAncestor(node, node, right));
  }
}