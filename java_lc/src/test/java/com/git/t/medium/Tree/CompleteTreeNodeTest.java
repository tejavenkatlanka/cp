package com.git.t.medium.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class CompleteTreeNodeTest {

  @Test
  void countNodes() {
    CompleteTreeNode completeTreeNode = new CompleteTreeNode();
    assertEquals(1, completeTreeNode.countNodes(new TreeNode(32)));
  }

  @Test
  void countNodesIt() {
    CompleteTreeNode completeTreeNode = new CompleteTreeNode();
    assertEquals(1, completeTreeNode.countNodesIt(new TreeNode(32)));
  }
}