package com.joao.Q2;

import com.joao.utils.CaseTest;

import java.util.ArrayList;


public class Questao2 {
    public static void main(String[] args) {
        ArrayList<CaseTest> tests = new ArrayList<>();



        tests.add(new CaseTest("you","yuo"));
        tests.add(new CaseTest("probably","porbalby"));
        tests.add(new CaseTest("despite","desptie"));
        tests.add(new CaseTest("moon","nmoo"));
        tests.add(new CaseTest("misspellings","mpeissngslli"));
        tests.add(new CaseTest("a","a"));

        for(CaseTest test: tests){
            System.out.println(test.getA()+","+ test.getB()+" -> "+ checkJumbled(test.getA(),test.getB()));
        }
    }


    public static boolean checkJumbled(String correct, String  wrong){

        correct = correct.toLowerCase().trim();
        wrong = wrong.toLowerCase().trim();


        int mainLen = correct.length();


        if(mainLen != wrong.length()
                || correct.charAt(0) != wrong.charAt(0))
            return false;



        int moveCount = 0;
        for (int i = 0; i < mainLen; i++) {
            int j = wrong.indexOf(correct.charAt(i));

            if(j == -1) return false;

            if(i != j) moveCount ++;



        }
        if(mainLen> 3){
            if(moveCount < mainLen * (2f/3f) ) return true;
        }else{
            return moveCount >= 0;
        }

        return false;
    }
}
