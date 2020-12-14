package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

public class TrimBst {

  public TreeNode trimBSTRec(TreeNode root, int low, int high) {
    if (root == null) {
      return null;
    }
    if (root.val > high) {
      return trimBSTRec(root.left, low, high);
    }
    if (root.val < low) {
      return trimBSTRec(root.right, low, high);
    }

    root.left = trimBSTRec(root.left, low, high);
    root.right = trimBSTRec(root.right, low, high);
    return root;
  }


  public TreeNode trimBST(TreeNode root, int low, int high) {
    TreeNode headReturn = root;
    if (root == null) {
      return null;
    }
    headReturn = processLeft(low, headReturn);

    return headReturn == null ? null : processRight(high, headReturn);

  }

  private TreeNode processRight(int high, TreeNode headReturn) {
    TreeNode currentNode = headReturn;
    TreeNode pre = headReturn;
    while (currentNode != null) {
      if (isLower(currentNode, high)) {
        pre = currentNode;
        currentNode = currentNode.right;

      } else {
        if (currentNode == headReturn) {
          headReturn = headReturn.left;
          currentNode = headReturn;
        } else {
          pre.right = currentNode.left;
          currentNode = currentNode.left;

        }

      }
    }
    return headReturn;
  }

  private TreeNode processLeft(int low, TreeNode headReturn) {
    TreeNode currentNode = headReturn;
    TreeNode pre = headReturn;
    while (currentNode != null) {
      if (isHigher(currentNode, low)) {
        pre = currentNode;
        currentNode = currentNode.left;

      } else {
        if (currentNode == headReturn) {
          headReturn = headReturn.right;
          currentNode = headReturn;
        } else {
          pre.left = currentNode.right;
          currentNode = currentNode.right;

        }

      }
    }
    return headReturn;
  }

  private boolean isHigher(TreeNode node, int low) {
    if (node.val >= low) {
      return true;
    }
    return false;
  }

  private boolean isLower(TreeNode node, int high) {
    if (node.val <= high) {
      return true;
    }
    return false;
  }
}
