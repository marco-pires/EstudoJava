package com.java;

public class OperadorLogico {
    public static void main(String[] args) {

        /* Duas comparações para checar se a idade é maior ou igual a 18 e menor que 70
           usando o operador &&
        */

        /*
        int idade = 20;
        boolean precisaVotar = idade >= 18 && idade < 70;
        System.out.println(precisaVotar);
        */

        /*
        //Operador '^' OU/OR
        int x = 9, y = 11;
        boolean teste = x > 10 ^ y >10;
        System.out.println(teste);
        */


        //Operador de negação
        int idade = 20;
        boolean maiorIdade = !(idade >= 18);
        System.out.println(maiorIdade);
    }
}
