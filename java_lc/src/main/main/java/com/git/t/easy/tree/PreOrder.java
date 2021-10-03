package com.git.t.easy.tree;

import com.git.t.common.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder {

  public List<Integer> preorder(Node root) {
    List<Integer> preOrder = new ArrayList<>();
    if (root == null) {
      return preOrder;
    }
    Stack<Node> nodes = new Stack<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      Node node = nodes.pop();
      preOrder.add(node.val);
      List<Node> childes = node.children;
      if (childes != null) {
        for (int i = childes.size() - 1; i >= 0; i--) {
          nodes.push(childes.get(i));
        }
      }
    }
    return preOrder;
  }
}
