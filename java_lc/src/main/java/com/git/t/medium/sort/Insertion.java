package com.git.t.medium.sort;

import com.git.t.common.ListNode;

public class Insertion {
    public ListNode insertionSortList(ListNode head) {

        ListNode dummy = new ListNode();
        ListNode curr = head, pre, nextNode;
        while (curr != null) {
            pre = dummy;
            nextNode = dummy.next;

            while (nextNode != null) {
                if (curr.val < nextNode.val)
                    break;
                pre = nextNode;
                nextNode = nextNode.next;

            }
            ListNode nextIt = curr.next;
            curr.next = nextNode;
            pre.next = curr;
            curr = nextIt;
        }

        return dummy.next;
    }
}
