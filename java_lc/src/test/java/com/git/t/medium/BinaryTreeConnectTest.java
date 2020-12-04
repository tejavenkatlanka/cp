package com.git.t.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.git.t.common.Node;
import org.junit.jupiter.api.Test;

class BinaryTreeConnectTest {

  @Test
  void connect() {
    BinaryTreeConnect bt = new BinaryTreeConnect();
    Node root = new Node();
    root.val = 1;
    ////////////////////////
    Node ll1 = new Node();
    ll1.val = 2;
    Node lr1 = new Node();
    lr1.val = 3;
    root.left = ll1;
    root.right = lr1;
    //////////////////////////
    Node ll2 = new Node();
    ll2.val = 4;
    Node lr2 = new Node();
    lr2.val = 5;
    ll1.left = ll2;
    ll1.right = lr2;
    Node rr2 = new Node();
    rr2.val = 6;
    lr1.right = rr2;
    ////////////////////////////////////////
    Node rr3 = new Node();
    rr3.val = 8;
    rr2.right = rr3;
    Node ll3 = new Node();
    ll3.val = 7;
    ll2.left = ll3;
    bt.connect(root);
    assertEquals(ll3.next, rr3);


  }
}