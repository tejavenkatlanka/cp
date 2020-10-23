package com.git.t.easy;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildTreeFromPostAndInOrderTest {

    @Test
    void buildTree() {
        BuildTreeFromPostAndInOrder build=new BuildTreeFromPostAndInOrder();
         TreeNode node=build.buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3});
        assertEquals(node.val,3);
    }
}