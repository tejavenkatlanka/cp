package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class SecondMinNodeTest {

  @Test
  void findSecondMinimumValue() {
    SecondMinNode secondMinNode = new SecondMinNode();
    assertEquals(-1, secondMinNode.findSecondMinimumValue(new TreeNode(2)));
  }

  @Test
  void findSecondMinimumValueBsf() {
    SecondMinNode secondMinNode = new SecondMinNode();
    assertEquals(-1, secondMinNode.findSecondMinimumValueBsf(new TreeNode(2)));
  }
}