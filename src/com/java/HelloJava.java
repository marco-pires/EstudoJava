package com.java;

public class HelloJava {
    public static void main(String[] args) {

        int x = 10;     //declaração de uma variável do tipo int
        double d = x;   //variável double recebe um tipo int
        long l = x;     //variável long recebe um tipo int
        float f = x;    //variável float recebe um tipo int
        short s = 20;   //declaração de uma variável do tipo short
        x = s;          //variável int recebe um tipo short

        double valorDouble = 9.99;
        int valorInt = (int) valorDouble;
        System.out.println(valorInt);


    }
}
