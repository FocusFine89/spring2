package com.example.spring2.entities;

public class TestFunzioni {


    //Metodi

    public static int somma(int a, int b){
        return a+b;
    }

    public static int sommaArray(int[] numeri){
        int a = 0;
        for (int numero : numeri){
            a+=numero;
        }
        return a;
    }

}
