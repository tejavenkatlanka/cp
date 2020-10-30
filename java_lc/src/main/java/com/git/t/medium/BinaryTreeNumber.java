package com.git.t.medium;

import com.git.t.common.TreeNode;

public class BinaryTreeNumber {

    public int sumNumbers(TreeNode root) {
        return sumHelper(root,0);
    }

    public int sumHelper(TreeNode node, int sum) {
        if (node == null) {
            return sum;
        }
        int pre=(sum*10)+node.val;
        if(node.left==null&node.right==null){
            return pre;
        }
        int total=0;
        if(node.left!=null){
            total+=  sumHelper(node.left,pre);
        }
        if(node.left!=null){
            total+=  sumHelper(node.right,pre);
        }
         return total;
    }
}
