package com.joao.Q5;

public class LinkedList <T>{
    private Node head;
    private int size;

    public LinkedList(){
        this.size = 0;

    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }



    public void add(T object){

        Node<T> a = new Node(object);

       this.add(a);
    }

    public void add(Node<T> node){
        Node<T> tail = getTail();


        if(tail == null){

            this.head = node;

        }else {

            tail.setNext(node);
        }
        this.size++;
    }

    public void removeEquals(){
        Node start = head;

        while(start != null){
            Node target = start.getNext();

            while(target != null && target.getNext() != null){
                if (start.getData().equals(target.getNext().getData())){


                    target.setNext(target.getNext().getNext());
                    this.size --;
                }
                target = target.getNext();

            }

            start = start.getNext();

        }

    }

    public Node getTail() {

        Node tail = head;

        while(tail != null && tail.getNext() != null ){
            tail = tail.getNext();
        }

        return tail;
    }

    @Override
    public String toString() {

        String result ="LinkedList{";

        Node start = head;
        for (int i = 0; i < size; i++) {
            result += "'"+ start.getData() +"'";
            start = start.getNext();
        }
        result += '}';
        return result;
    }

    public static class Node<T>{
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
}
