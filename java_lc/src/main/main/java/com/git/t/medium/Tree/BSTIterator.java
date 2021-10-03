package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BSTIterator {

  int i = 0, length = 0;
  int[] anInt;

  public BSTIterator(TreeNode root) {
    ArrayList<Integer> integers = new ArrayList<Integer>() {
    };
    preorderT(root, integers);
    anInt = new int[integers.size()];
    for (int index = 0; index < integers.size(); index++) {
      anInt[index] = integers.get(index);
    }
    length = anInt.length;
    return;
  }

  private void preorderT(TreeNode node, List<Integer> integers) {
    if (node == null) {
      return;
    }
    preorderT(node.left, integers);
    integers.add(node.val);
    preorderT(node.right, integers);
  }

  /**
   * @return the next smallest number
   */
  public int next() {
    return anInt[i++];
  }

  /**
   * @return whether we have a next smallest number
   */
  public boolean hasNext() {
    return i < length;
  }
}
