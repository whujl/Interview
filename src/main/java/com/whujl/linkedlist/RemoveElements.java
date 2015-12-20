package com.whujl.linkedlist;

/**
 * Created by whujl on 15/11/30.
 */
public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;

        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return dummy.next;
    }

}
