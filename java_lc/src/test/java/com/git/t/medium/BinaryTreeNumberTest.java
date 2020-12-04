package com.git.t.medium;

import com.git.t.common.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreeNumberTest {

  @Test
  void sumNumbers() {
    BinaryTreeNumber treeNumber = new BinaryTreeNumber();
    Assertions.assertEquals(1, treeNumber.sumNumbers(new TreeNode(1)));


  }
}