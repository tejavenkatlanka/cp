package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class SubTreeTest {

  @Test
  void isSubtree() {
    SubTree subTree = new SubTree();
    assertTrue(subTree.isSubtree(null, null));
    assertTrue(subTree.isSubtree(new TreeNode(1), new TreeNode(1)));
  }
}