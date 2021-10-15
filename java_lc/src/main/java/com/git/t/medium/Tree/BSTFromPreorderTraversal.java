package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;
import java.util.Stack;

public class BSTFromPreorderTraversal {

  public TreeNode bstFromPreorder(int[] preorder) {
    int i = 1;
    Stack<TreeNode> treeNodes = new Stack<>();

    TreeNode node = new TreeNode(preorder[0]);
    treeNodes.add(node);
    while (i < preorder.length) {
      TreeNode treeNode = new TreeNode(preorder[i++]);

      if (treeNode.val < treeNodes.peek().val) {
        treeNodes.peek().left = treeNode;

      } else {
        TreeNode pre = treeNodes.peek();
        while (!treeNodes.isEmpty() && treeNodes.peek().val < treeNode.val) {
          pre = treeNodes.pop();
        }
        pre.right = treeNode;
      }
      treeNodes.push(treeNode);

    }
    return node;
  }


  public TreeNode bstFromPreorder1(int[] preorder) {

    return helper(preorder, Integer.MAX_VALUE, new int[]{0});
  }

  private TreeNode helper(int[] preOrder, int max, int[] index) {

    if (index[0] == preOrder.length || preOrder[index[0]] > max) {
      return null;
    }

    TreeNode node = new TreeNode(preOrder[index[0]++]);

    node.left = helper(preOrder, node.val, index);
    node.right = helper(preOrder, max, index);
    return node;

  }
}
