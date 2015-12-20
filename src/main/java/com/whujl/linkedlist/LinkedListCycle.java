package com.whujl.linkedlist;

/**
 * Created by whujl on 15/11/29.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != slow){
            if(fast == null || fast.next == null){
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return true;
    }

}