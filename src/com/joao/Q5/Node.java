package com.joao.Q5;

public class Node <T> {
    private T data;
    private Node next;


    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }


    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;

    }
}