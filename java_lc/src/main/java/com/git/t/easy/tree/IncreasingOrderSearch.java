package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import java.util.Stack;

public class IncreasingOrderSearch {

  public TreeNode increasingBST(TreeNode root) {
    TreeNode head = new TreeNode(0);
    TreeNode curr = head;
    Stack<TreeNode> nodeStack = new Stack<>();
    nodeStack.add(root);

    while (!nodeStack.isEmpty()) {
      TreeNode node = nodeStack.peek();
      if (node.left != null) {
        nodeStack.add(node.left);
        node.left = null;
      } else if (node.right != null) {
        curr.right = nodeStack.pop();
        curr = curr.right;
        nodeStack.add(node.right);
        node.right = null;
      } else {
        curr.right = nodeStack.pop();
        curr = curr.right;
      }

    }
    return  head.right;
  }
}
