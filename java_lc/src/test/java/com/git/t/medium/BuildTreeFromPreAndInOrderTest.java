package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class BuildTreeFromPreAndInOrderTest {

  @Test
  void buildTree() {
    BuildTreeFromPreAndInOrder build = new BuildTreeFromPreAndInOrder();
    TreeNode node = build.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
    assertEquals(node.val, 3);
  }
}