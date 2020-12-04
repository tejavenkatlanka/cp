package com.git.t.medium.Tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Test;

class PostTraversalTest {

  @Test
  void postorderTraversal() {
    PostTraversal postTraversal = new PostTraversal();
    TreeNode node = new TreeNode(1);
    assertEquals(List.of(1), postTraversal.postorderTraversal(node));
    node.right = new TreeNode(2);
    assertEquals(List.of(2, 1), postTraversal.postorderTraversal(node));

  }
}