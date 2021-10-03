package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class TreeString {

  /**
   * 1 /   \ 2     3 / 4
   * <p>
   * Output: "1(2(4))(3)"
   *
   * @param t
   * @return
   */
  public String tree2str(TreeNode t) {
    StringBuilder builder = new StringBuilder();
    if (t != null) {
      buildTree(t, builder);
    }
    return builder.toString();
  }

  private void buildTree(TreeNode node, StringBuilder builder) {

    builder.append(node.val);

    if (node.left != null || node.right != null) {
      builder.append("(");
      buildTree(node.left, builder);
      builder.append(")");

    }
    if (node.right != null) {
      builder.append("(");
      buildTree(node.right, builder);
      builder.append(")");

    }


  }
}
