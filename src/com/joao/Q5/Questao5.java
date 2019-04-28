package com.joao.Q5;

public class Questao5 {

    public static void main(String[] args) {


        Node head = new Node("mensagem1");

        Node second = new Node("mensagem2");
        head.setNext(second);

        Node third = new Node("mensagem1");
        second.setNext(third);

        printList(head);

        head = removeEqualsFromHead(head);

        printList(head);



    }

    public static void printList(Node head){

        while(head != null){
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
        System.out.println("");



    }

    public static Node removeEqualsFromHead(Node head){
        Node start = head;

        while(start != null){
            Node target = start.getNext();

            while(target != null && target.getNext() != null){
                if (start.getData().equals(target.getNext().getData())){


                    target.setNext(target.getNext().getNext());

                }
                target = target.getNext();

            }

            start = start.getNext();

        }

        return head;
    }






}
