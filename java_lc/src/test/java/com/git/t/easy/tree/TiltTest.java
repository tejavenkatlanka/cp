package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TiltTest {

    @Test
    void findTilt() {
        Tilt tilt=new Tilt();
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        assertEquals(1,tilt.findTilt(node));

    }
}