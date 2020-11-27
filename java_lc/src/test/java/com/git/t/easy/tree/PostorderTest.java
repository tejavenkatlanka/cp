package com.git.t.easy.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.Node;
import java.util.List;
import org.junit.jupiter.api.Test;

class PostorderTest {

  @Test
  void postorder1() {
  Postorder postorder=new Postorder();
  assertEquals(List.of(1),postorder.postorder(new Node(1)));
  }
}