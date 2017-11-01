package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 11/09/2017.
 * Realice un programa donde pida un número entero al usuario y muestre los numeros primos
 desde el 1 hasta el número que ingreso
 */
public class NumPrimos{

    public static void main(String[] args) {
        /*
        Se solicita información al usuario usando el teclado mediante Scanner. Para ello se crea un objeto de esta clase
         */
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        /*
        Se declara y se restringe cómo obtener la información, esto
        ultimo con el método nextInt que unicamente obtiene el valor entero hasta que se encuentre un espacio
         */
       int numero = s1.nextInt();
        //Se llama al método primos para obtener el resultado.
        System.out.println("Números primos: ");
        primos(numero);
    }
    //Se toma el valor de la variable numero
    public static void primos(int  numero) {
        /*
        Se hace uso de un caso base que da fin al metodo recursivo
        si el numero es mayor o igual a 0
         */
        if (numero>=0){//caso base
            //Se hace uso del metodo primos, disminuyendo el 1 el valor asignado
                primos(numero-1);
            /*
            La siguiente condición imprime el número si este es número primo. Para ello se hace uso de la
            formula: numero mod 2 es diferente de 0, es un numero primo. De ser así se imprime el valor con un espacio.
             */
            if((numero%2)!=0){
                System.out.print(numero + " ");
            }

        }

    }
}