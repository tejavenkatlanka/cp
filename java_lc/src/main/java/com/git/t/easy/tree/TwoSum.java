package com.git.t.easy.tree;

import com.git.t.common.TreeNode;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

  public boolean findTarget(TreeNode root, int k) {
    Set<Integer> cache = new HashSet<>();
    return findHelper(cache, root, k);
  }

  private boolean findHelper(Set<Integer> cache, TreeNode root, int k) {
    if (root == null) {
      return false;
    }
    if (cache.contains(k - root.val)) {
      return true;
    }
    cache.add(root.val);
    return findHelper(cache, root.left, k) || findHelper(cache, root, k);
  }
}
