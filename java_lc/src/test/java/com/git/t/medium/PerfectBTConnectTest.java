package com.git.t.medium;

import com.git.t.common.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerfectBTConnectTest {

    @Test
    void connect() {
        PerfectBTConnect obj = new PerfectBTConnect();
        Node root = new Node();
        root.val = 1;
        Node left = new Node();
        left.val = 2;
        root.left = left;
        Node right = new Node();
        right.val = 3;
        root.right = right;

        assertEquals(right, obj.connect(root).left.next);
    }
}