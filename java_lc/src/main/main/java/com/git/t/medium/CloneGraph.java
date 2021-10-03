package com.git.t.medium;

import com.git.t.common.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

  Map<Integer, Node> nodeMap = new IdentityHashMap<>();

  public Node cloneGraph(Node node) {
    if (node == null) {
      return null;
    }
    Map<Node, Node> map = new HashMap<>();
    Queue<Node> nodes = new LinkedList<>();
    nodes.add(node);
    map.put(node, new Node(node.val));
    while (!nodes.isEmpty()) {
      Node curr = nodes.poll();
      for (Node n : curr.neighbors) {
        if (!map.containsKey(n)) {
          Node neClone = new Node(n.val);
          neClone.neighbors = new ArrayList<>();
          map.put(n, neClone);
          nodes.add(n);
        }

        map.get(curr).neighbors.add(map.get(n));

      }
    }

    return map.get(node);
  }

  public Node cloneGraphdsf(Node node) {
    if (node == null) {
      return null;
    }
    //dsf
    if (nodeMap.containsKey(node.val)) {
      return (nodeMap.get(node.val));
    }

    Node cloneNode = new Node(node.val);
    nodeMap.put(node.val, cloneNode);
    cloneNode.neighbors = new ArrayList<>();
    for (Node neighbor : node.neighbors) {
      cloneNode.neighbors.add(cloneGraph(neighbor));
    }
    return cloneNode;
  }


  private List<Node> cloneNeighbours(List<Node> nodes, Map<Integer, Node> nodeMap) {
    List<Node> list = new ArrayList<>();
    for (int i = 0; i < nodes.size(); i++) {
      Node node = nodes.get(i);
      Node cloneNode = null;
      if (nodeMap.containsKey(node.val)) {
        cloneNode = (nodeMap.get(node.val));
      } else {
        cloneNode = new Node(node.val);
        nodeMap.put(node.val, cloneNode);
        cloneNode.neighbors = cloneNeighbours(node.neighbors, nodeMap);
      }
      list.add(cloneNode);
    }
    return list;
  }
}
