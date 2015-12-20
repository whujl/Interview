package com.whujl.linkedlist;

/**
 * Created by whujl on 15/11/29.
 */
public class DeleteNode {

    public void deleteNode(ListNode node) {
        if (node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public String toString(){
            return val + " ";
        }

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        new DeleteNode().deleteNode(node3);
        System.out.println(node2);
    }
}
