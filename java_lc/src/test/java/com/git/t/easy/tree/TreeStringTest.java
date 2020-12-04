package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class TreeStringTest {

  @Test
  void tree2str() {
    TreeString treeString = new TreeString();

    assertEquals("1", treeString.tree2str(new TreeNode(1)));
  }
}