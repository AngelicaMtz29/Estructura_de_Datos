package com.company;

/**
 * Created by Angie on 11/09/2017.
 */
public class Recursividad {
    public static  void main(String[] args){
        cuentaRegresiva(10);
    }

    static void cuentaRegresiva(int numero){

       if(numero>=0){
            System.out.println(numero);
            cuentaRegresiva(numero-1);
       }



    }

}
