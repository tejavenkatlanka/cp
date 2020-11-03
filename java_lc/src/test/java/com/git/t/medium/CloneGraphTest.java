package com.git.t.medium;

import com.git.t.common.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CloneGraphTest {

    @Test
    void cloneGraph() {
        CloneGraph graph=new CloneGraph();
        Node node =new Node(1);
        node.neighbors=new ArrayList<>();
        assertEquals(node.val, graph.cloneGraph(node).val);
    }
}