package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class PreOrderTest {

  @Test
  void preorderTraversal() {
    PreOrder order = new PreOrder();

    assertEquals(List.of(), order.preorderTraversal(null));
    assertEquals(List.of(1), order.preorderTraversal(new TreeNode(1)));

  }
}