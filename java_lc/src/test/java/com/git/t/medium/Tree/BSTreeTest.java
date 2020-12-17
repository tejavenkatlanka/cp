package com.git.t.medium.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class BSTreeTest {

  @Test
  void kthSmallest() {
    BSTree bsTree = new BSTree();
    assertEquals(1, bsTree.kthSmallest(new TreeNode(1), 1));
  }
}