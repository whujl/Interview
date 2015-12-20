package com.whujl.linkedlist;

/**
 * Created by whujl on 15/11/29.
 */
public class PrintListReversingly {

    public void print(Node node){
        if(node == null){
            return;
        }
        print(node.getNext());
        System.out.println(node.getValue());
    }

    public static void main(String[] args) {
        Node<Integer> node5 = new Node<Integer>(5, null);
        Node<Integer> node4 = new Node<Integer>(4, node5);
        Node<Integer> node3 = new Node<Integer>(3, node4);
        Node<Integer> node2 = new Node<Integer>(2, node3);
        Node<Integer> node1 = new Node<Integer>(1, node2);
        Node<Integer> node0 = new Node<Integer>(0, node1);
        new PrintListReversingly().print(node0);

    }

}
