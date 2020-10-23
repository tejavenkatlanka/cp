package com.git.t.easy;

import com.git.t.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeFromPreAndInOrder {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(0, 0, inorder.length, preorder, inorder);
    }

    private TreeNode buildTreeHelper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preStart]);
        int index = map.get(preorder[preStart]);
      /*  for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == preorder[preStart]) {
                index = i;
                break;
            }
        }*/
        node.left = buildTreeHelper(preStart + 1, inStart, index - 1, preorder, inorder);
        node.right = buildTreeHelper(preStart + index - inStart + 1, index + 1, inEnd, preorder, inorder);
        return node;
    }
}
