package com.git.t.easy.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthTreeTest {

    @Test
    void maxDepth() {
        DepthTree depthTree=new DepthTree();

        assertEquals(0,depthTree.maxDepth(null));
    }
}