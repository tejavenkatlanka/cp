package com.git.t.medium;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PreOrderTest {

    @Test
    void preorderTraversal() {
        PreOrder order =new PreOrder();

        assertEquals(List.of(),order.preorderTraversal(null));
        assertEquals(List.of(1),order.preorderTraversal(new TreeNode(1)));

    }
}