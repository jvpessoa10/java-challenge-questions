package com.joao.Q7;

import com.joao.Q5.Node;

public class Questao7 {

    public static void main(String[] args) {

        Node<String> head = new Node<>("mensagem1");

        Node<String> second = new Node<>("mensagem2");
        head.setNext(second);

        Node<String> third = new Node<>("mensagem1");
        second.setNext(third);



        Node<String> head2 = new Node<>("mensagem1");

        Node<String> second2 = new Node<>("mensagem2");
        head2.setNext(second2);






        boolean hasIntersection = getIntersection(head,head2) != null;
        System.out.println("Possuem intercessão: "+hasIntersection);



        //CRIA E ADICIONA A MESMA REFERENCIA NAS DUAS LISTAS
        Node<String> testNode = new Node<String>("Eu sou a intercessão");


        third.setNext(testNode);
        second2.setNext(testNode);



        hasIntersection = getIntersection(head,head2) != null;

        System.out.println("Possuem intercessão: "+hasIntersection);


    }


    public static Node getIntersection(Node left, Node right){

        if(left == right){
            return left;
        }

        while(left.getNext() != null || right.getNext() != null){



            if(left.getNext() != null){
                left = left.getNext();
            }
            if(right.getNext() != null){
                right = right.getNext();
            }

            if(left == right){
                return left;
            }
        }


        return null;

    }
}
