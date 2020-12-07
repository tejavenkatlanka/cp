package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class AverageLevelTest {

  @Test
  void averageOfLevels() {
    AverageLevel averageLevel = new AverageLevel();
    TreeNode node = new TreeNode(3);
    node.left = new TreeNode(9);
    node.right = new TreeNode(20);
    node.right.left = new TreeNode(15);
    node.right.right = new TreeNode(7);
    assertEquals(List.of(3.0, 14.5, 11.0), averageLevel.averageOfLevels(node));
  }
}