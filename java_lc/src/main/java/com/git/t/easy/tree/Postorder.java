package com.git.t.easy.tree;

import com.git.t.common.Node;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Postorder {

  public List<Integer> postorder(Node root) {
    LinkedList<Integer> integers = new LinkedList<>();
    dfs(root, integers);
    return integers;
  }

  public void dfs(Node n, LinkedList<Integer> cur) {
    if (n == null) {
      return;
    }
    if (n.children != null) {
      for (Node c : n.children) {
        dfs(c, cur);

      }
    }
    cur.addFirst(n.val);


  }

  public List<Integer> postorder1(Node root) {
    LinkedList<Integer> integers = new LinkedList<>();
    if (root == null) {
      return integers;
    }
    Stack<Node> nodes = new Stack<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      Node node = nodes.pop();
      List<Node> children = node.children;
      if (children != null) {
        for (int i = 0; i < children.size(); i++) {
          nodes.push(children.get(i));
        }
      }
      integers.addFirst(node.val);
    }
    return integers;
  }
}
