package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class TiltTest {

  @Test
  void findTilt() {
    Tilt tilt = new Tilt();
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(2);
    node.right = new TreeNode(3);
    assertEquals(1, tilt.findTilt(node));

  }
}