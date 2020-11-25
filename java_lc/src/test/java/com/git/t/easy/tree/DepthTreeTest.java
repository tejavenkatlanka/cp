package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DepthTreeTest {

  @Test
  void maxDepth() {
    DepthTree depthTree = new DepthTree();

    assertEquals(0, depthTree.maxDepth(null));
  }
}