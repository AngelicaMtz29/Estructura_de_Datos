package com.company;

/**
 * Created by Angie on 11/09/2017.
 */
public class Factorial {
    public static double factorial(int num){
        double f=1;
        for (int i=1; i<=num; i++)
            f*=i;
        return f;
    }

    public static void main (String[] args){
        System.out.println("Valor");

    }
}
