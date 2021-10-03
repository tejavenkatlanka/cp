package com.git.t.medium;

import com.git.t.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathToSum {

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> lists = new ArrayList<>();
    if (root != null) {
      pathSumHelper(lists, new ArrayList<Integer>(), sum, root);
    }
    return lists;
  }

  public void pathSumHelper(List<List<Integer>> res, List<Integer> temp, int sum, TreeNode node) {
    if (node == null) {
      return;
    }
    int s = sum - node.val;
    temp.add(node.val);
    if (node.left == null && node.right == null && sum == node.val) {
      res.add(new ArrayList<Integer>(temp));
      temp.remove(temp.size() - 1);
      return;
    } else {
      pathSumHelper(res, temp, s, node.left);
      pathSumHelper(res, temp, s, node.right);

    }
    temp.remove(temp.size() - 1);
  }

}
