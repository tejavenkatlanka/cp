package com.git.t.medium;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenTreeTest {

    @Test
    void flatten() {
        FlattenTree tree=new FlattenTree();
        TreeNode node=new TreeNode(5);
        TreeNode left=new TreeNode(2);
        node.left=left;
        tree.flatten(node);
        assertEquals(left,node.right);
    }
}