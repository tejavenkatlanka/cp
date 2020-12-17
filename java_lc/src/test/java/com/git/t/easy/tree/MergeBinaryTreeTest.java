package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class MergeBinaryTreeTest {

  @Test
  void mergeTrees() {
    MergeBinaryTree mergeBinaryTree = new MergeBinaryTree();
    assertEquals(5, mergeBinaryTree.mergeTrees(new TreeNode(2), new TreeNode(3)).val);
  }
}