package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RightSideViewTest {

  @Test
  void rightSideView() {
    RightSideView rightSIdeVIew = new RightSideView();
    Assertions.assertEquals(List.of(1), rightSIdeVIew.rightSideView(new TreeNode(1)));

    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    Assertions.assertEquals(List.of(1, 2), rightSIdeVIew.rightSideView(root));
    rightSideViewWithLeftSideChild();
  }

  @Test
  void rightSideViewWithLeftSideChild() {
    RightSideView rightSIdeVIew = new RightSideView();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    Assertions.assertEquals(List.of(1, 2), rightSIdeVIew.rightSideView(root));
  }
}