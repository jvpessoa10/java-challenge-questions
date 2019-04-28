package com.joao.Q7;

import com.joao.Q5.LinkedList;

public class Questao7 {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Texto1");
        list1.add("Texto2");
        list1.add("Texto3");

        LinkedList<String> list2 = new LinkedList<>();

        list2.add("Texto1");
        list2.add("Texto2");
        list2.add("Texto3");

        boolean hasIntersection = getIntersection(list1,list2) != null;

        System.out.println(hasIntersection);



        //CRIA E ADICIONA A MESMA REFERENCIA NAS DUAS LISTAS
        LinkedList.Node<String> testNode = new LinkedList.Node<>("Eu sou a intercessão");

        list1.add(testNode);
        list2.add(testNode);


        hasIntersection = getIntersection(list1,list2) != null;

        System.out.println(hasIntersection);


    }


    public static LinkedList.Node getIntersection(LinkedList left, LinkedList right){



        LinkedList.Node headA = left.getHead();
        LinkedList.Node headB = right.getHead();

        int len = (left.getSize() >= right.getSize())
                ? right.getSize() : left.getSize();

        for (int i = 0; i < len; i++) {
            if(headA == headB){
                return headA;
            }

            headA = headA.getNext();
            headB = headB.getNext();
        }

        return null;

    }
}
