package com.whujl.linkedlist;

/**
 * Created by whujl on 15/11/29.
 */
public class Node<T> {

    private final T value;
    private final Node<T> next;

    public Node(T value, Node<T> next){
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }
}
