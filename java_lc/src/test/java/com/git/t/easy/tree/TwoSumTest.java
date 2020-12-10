package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class TwoSumTest {

  @Test
  void findTarget() {
    TwoSum twoSum = new TwoSum();
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    assertTrue(twoSum.findTarget(root, 3));
  }
}