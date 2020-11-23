package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SubTreeTest {

    @Test
    void isSubtree() {
        SubTree subTree=new SubTree();
        assertTrue(subTree.isSubtree(null,null));
        assertTrue(subTree.isSubtree(new TreeNode(1),new TreeNode(1)));
    }
}