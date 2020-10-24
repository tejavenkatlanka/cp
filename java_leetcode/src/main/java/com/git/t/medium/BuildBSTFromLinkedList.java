package com.git.t.medium;

import com.git.t.common.ListNode;
import com.git.t.common.TreeNode;

public class BuildBSTFromLinkedList {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode mid = getMiddleNode(head);
        TreeNode node = new TreeNode(mid.val);
        if (mid == head)
            return node;
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(mid.next);
        return node;
    }


    public ListNode getMiddleNode(ListNode node) {
        ListNode preNode=null;
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null && fast.next != null) {
            preNode = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (preNode != null) {
            preNode.next = null;
        }
       return slow;
    }
}
