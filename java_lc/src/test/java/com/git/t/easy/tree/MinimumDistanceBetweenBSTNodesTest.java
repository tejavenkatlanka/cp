package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class MinimumDistanceBetweenBSTNodesTest {


  @Test
  void minDiffInBST() {
    MinimumAbsoluteDiffBST min = new MinimumAbsoluteDiffBST();

    TreeNode root = new TreeNode(2);

    root.left = new TreeNode(1);
    assertNotNull(min.getMinimumDifference(root));
  }
}