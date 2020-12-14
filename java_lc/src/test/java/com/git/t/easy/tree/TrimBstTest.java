package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

class TrimBstTest {

  @Test
  void trimBST() {
    TrimBst trimBst = new TrimBst();
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(0);
    node.right = new TreeNode(2);
    assertEquals(node, trimBst.trimBST(node, 1, 2));
  }

  @Test
  void trimBSTRec() {
    TrimBst trimBst = new TrimBst();
    TreeNode node = new TreeNode(1);
    node.left = new TreeNode(0);
    node.right = new TreeNode(2);
    assertEquals(node, trimBst.trimBSTRec(node, 1, 2));
  }
}