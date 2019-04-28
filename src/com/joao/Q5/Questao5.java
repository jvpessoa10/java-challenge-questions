package com.joao.Q5;

public class Questao5 {

    public static void main(String[] args) {


        LinkedList<String> lista = new LinkedList<String>();

        lista.add("Mensagem1");

        lista.add("Mensagem2");
        lista.add("Mensagem1");

        System.out.println(lista.toString());
        lista.removeEquals();
        System.out.println(lista.toString());


    }









}
