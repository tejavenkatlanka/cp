package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.Node;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class CloneGraphTest {

  @Test
  void cloneGraph() {
    CloneGraph graph = new CloneGraph();
    Node node = new Node(1);
    node.neighbors = new ArrayList<>();
    assertEquals(node.val, graph.cloneGraph(node).val);
  }
}