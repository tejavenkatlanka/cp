package com.git.t.easy.tree;

import com.git.t.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTMode {
    private Integer pre;
    private int count=1;
    private int max=0;

    public int[] findMode(TreeNode root) {
        if (root==null) return new int[0];

        List<Integer> means=new ArrayList<>();
        inOrder(root,means);
        int [] ret=new int[means.size()];
        for (int i=0;i<means.size();i++){
            ret[i]=means.get(i);
        }
        return  ret;
    }

    public  void inOrder(TreeNode node, List<Integer> integers){
        if(node==null) return;
        inOrder(node.left,integers);
        if(pre!=null){
            if(pre== node.val){
                count++;
            }
            else {
                count=1;
            }
        }
        if(count>max){
            max=count;
            integers.clear();
            integers.add(node.val);
        }
        else if(count==max){
            integers.add(node.val);
        }
        pre= node.val;
        inOrder(node.right,integers);
    }
}