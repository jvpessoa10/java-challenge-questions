package com.joao.Q3;

import com.joao.utils.CaseTest;

import java.util.ArrayList;

public class Questao3 {




    public static void main(String [] args){



        ArrayList<CaseTest> tests = new ArrayList<CaseTest>();
        tests.add(new CaseTest("pale","ple"));
        tests.add(new CaseTest("pales","pale"));
        tests.add(new CaseTest("pale","bale"));
        tests.add(new CaseTest("pale","bake"));

        for(CaseTest test: tests){
            System.out.println(test.getA()+","+ test.getB()+" -> "+ checkTypos(test.getA(),test.getB()));
        }


    }
    public static  Boolean checkTypos(String correct, String wrong){

        correct = correct.toLowerCase().trim();
        wrong = wrong.toLowerCase().trim();


        int MAX_TYPOS = 1
                ,lenA = correct.length()
                ,lenB = wrong.length();


        if(lenA - lenB >1 || lenB - lenA > 1) return false;

        int aIndex = 0, bIndex = 0, typos = 0;

        while(aIndex < lenA && bIndex< lenB){
            char aChar = correct.charAt(aIndex), bChar = wrong.charAt(bIndex);
            if(aChar == bChar) {
                aIndex++;
                bIndex++;

            }else{
                if(typos == 1) return false;

                if (lenA > lenB) aIndex++;
                else if (lenA<lenB)bIndex++;
                else{
                    aIndex++;
                    bIndex++;
                }


                typos++;
            }

        }

        return typos<= MAX_TYPOS ;

    }
}
