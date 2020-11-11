package com.git.t.medium.Tree;

import com.git.t.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostTraversal {

    public List<Integer> postorderTraversalIt(TreeNode root) {
        LinkedList<Integer> respone = new LinkedList<>();
        if(root==null) return respone;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curNode=root;
        while (!stack.isEmpty()|| curNode!=null){
            if(curNode!=null){
                stack.push(curNode);
                respone.addFirst(curNode.val);
                curNode=curNode.right;
            }
            else {
                curNode=stack.pop();
                curNode=curNode.left;

            }
        }
        return respone;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> respone = new ArrayList<>();
        postorderHelper(respone,root);
        return respone;
    }

    private void postorderHelper(List<Integer> respone, TreeNode node){
        if(node==null) return;
        if(node.left!=null)
            postorderHelper(respone,node.left);
        if(node.right!=null)
            postorderHelper(respone,node.right);
        respone.add(node.val);

    }

}
