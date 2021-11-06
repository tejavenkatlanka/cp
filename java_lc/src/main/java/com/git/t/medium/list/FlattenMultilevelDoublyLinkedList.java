package com.git.t.medium.list;

public class FlattenMultilevelDoublyLinkedList {

  public Node flatten(Node head) {
    if (head == null) {
      return null;
    }
    return flattenIt(head, null);
  }

  private Node flattenIt(Node head, Node end) {

    Node ret = head;
    Node cur = ret;
    Node pre = ret;
    while (cur != null) {

      if (cur.child != null) {
        cur.child.prev= cur;
        Node child=cur.child;
        cur.child=null;

        cur.next = flattenIt(child,cur.next);


      }
      pre = cur;
      cur = cur.next;

    }
    if(end!=null) {
      pre.next = end;
      end.prev=pre;
    }
    return ret;
  }




  class Node {

    public int val;
    public Node prev;
    public Node next;
    public Node child;
  }

  ;
}
