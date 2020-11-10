package com.git.t.medium;

import com.git.t.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {


    public List<Integer> preorderTraversalItr(TreeNode root) {
        List<Integer> respo = new ArrayList<>();
        if(root==null) return  respo;
        Stack<TreeNode> treeNodes=new Stack<>();
        treeNodes.push(root);
        while (!treeNodes.isEmpty()){
            TreeNode node= treeNodes.pop();
            respo.add(node.val);
            if(node.right!=null) treeNodes.push(node.right);
            if(node.left!=null) treeNodes.push(node.left);
        }
        return respo;
    }


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> respo = new ArrayList<>();

        preOrderHelper(root, respo);
        return respo;
    }

    private void preOrderHelper(TreeNode node, List<Integer> integers) {
        if (node == null)
            return;
        integers.add(node.val);
        preOrderHelper(node.left, integers);
        preOrderHelper(node.right, integers);

    }
}
