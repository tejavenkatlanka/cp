package com.git.t.medium;

import com.git.t.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTreeFromPostAndInOrder {
    Map<Integer, Integer> hm = new HashMap<>();
    int pe = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        for (int i = 0; i < inorder.length; ++i)
            hm.put(inorder[i], i);
        pe = postorder.length - 1;
        return build(0, inorder.length - 1, inorder, postorder);
    }

    private TreeNode build(int is, int ie, int[] inorder, int[] postorder) {
        if (is > ie)
            return null;
        TreeNode node = new TreeNode(postorder[pe]);
        int i = hm.get(postorder[pe]);
        pe--;
        node.right = build(i + 1, ie, inorder, postorder);
        node.left = build(is, i - 1, inorder, postorder);
        return node;
    }

    private TreeNode build1(int ps, int pe, int is, int ie, int[] inorder, int[] postorder) {
        if (ps > pe || is > ie)
            return null;
        TreeNode node = new TreeNode(postorder[pe]);
        int i = hm.get(postorder[pe]);
        node.left = build1(ps, ps + i - is - 1, is, i - 1, inorder, postorder);
        node.right = build1(ps + i - is, pe - 1, i + 1, ie, inorder, postorder);
        return node;
    }
}
