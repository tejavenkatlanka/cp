package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

  @Test
  void searchBST() {
    BinaryTree binaryTree = new BinaryTree();

    TreeNode root = new TreeNode(2);
    TreeNode node = binaryTree.searchBST(root, 2);
    assertEquals(root, node);
  }
}