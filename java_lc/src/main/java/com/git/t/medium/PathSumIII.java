package com.git.t.medium;

import com.git.t.common.TreeNode;
import java.util.HashMap;

public class PathSumIII {

  private int count;

  public int pathSum(TreeNode root, int targetSum) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);
    helper(root,0,targetSum,map);
    return count;
  }

  public void helper(TreeNode root, int current, int target, HashMap<Integer, Integer> cal) {
    if (root == null) {
      return;
    }

    current += root.val;

    if (cal.containsKey(current - target)) {
      count += cal.get(current - target);
    }
    cal.put(current, cal.getOrDefault(current, 0) + 1);

    helper(root.left, current, target, cal);
    helper(root.right, current, target, cal);
    cal.put(current, cal.get(current) - 1);


  }


}
