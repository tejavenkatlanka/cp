package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PostTraversalTest {

    @Test
    void postorderTraversal() {
        PostTraversal postTraversal=new PostTraversal();
        TreeNode node=new TreeNode(1);
        assertEquals(List.of(1),postTraversal.postorderTraversal(node));
        node.right=new TreeNode(2);
        assertEquals(List.of(2,1),postTraversal.postorderTraversal(node));

    }
}