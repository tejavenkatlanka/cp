package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.Node;
import java.util.List;
import org.junit.jupiter.api.Test;

class PreOrderTest1 {

  @Test
  void preorder() {
    PreOrder preOrder = new PreOrder();

    assertEquals(List.of(1), preOrder.preorder(new Node(1)));
  }
}