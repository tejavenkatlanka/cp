package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumAbsoluteDiffBSTTest {

    @Test
    void getMinimumDifference() {
        MinimumAbsoluteDiffBST bst=new MinimumAbsoluteDiffBST();
        TreeNode node=new TreeNode(1);
        node.right=new TreeNode(3);

            assertEquals(2,bst.getMinimumDifference(node));


    }
}