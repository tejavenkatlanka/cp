package com.git.t.easy.tree;

import com.git.t.common.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DepthTree {

  int max = 0;

  public int maxDepths(Node root) {
    if (root == null) {
      return 0;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    int depth = 0;

    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        Node current = queue.poll();
        for (Node child : current.children) {
          queue.offer(child);
        }
      }

      depth++;
    }

    return depth;
  }

  public int maxDepth(Node root) {
    dsf(root, 0);
    return max;
  }

  private void dsf(Node node, int i) {
    if (node == null) {
      return;
    }
    i = i + 1;
    max = Math.max(max, i);
    List<Node> list = node.children;
    if (list == null || list.isEmpty()) {
      return;
    }
    for (int el = 0; el < list.size(); i++) {
      dsf(list.get(el), i);
    }
  }

}
