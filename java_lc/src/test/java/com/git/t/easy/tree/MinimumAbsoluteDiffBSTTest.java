package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class MinimumAbsoluteDiffBSTTest {

  @Test
  void getMinimumDifference() {
    MinimumAbsoluteDiffBST bst = new MinimumAbsoluteDiffBST();
    TreeNode node = new TreeNode(1);
    node.right = new TreeNode(3);

    assertEquals(2, bst.getMinimumDifference(node));


  }
}