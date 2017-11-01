package com.company;

import java.util.Scanner;
/**
 * Created by Angie on 05/09/2017.
 */
public class Operaciones {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int numero1, numero2;
        //Ingresar datos
        System.out.print("Introduce primer número: ");
        numero1=sc.nextInt();//Lee un entero.
        System.out.print("Introduce segundo número: ");
        numero2=sc.nextInt();
        //Resultados
        System.out.println("La suma es: "+ sumar(numero1,numero2));
        System.out.println("La resta es: "+ restar(numero1,numero2));
        System.out.println("La multiplicación es: "+ multiplicar(numero1,numero2));
        System.out.println("La división es: "+ dividir(numero1,numero2));


    }
    public static int sumar(int a, int b){
        int c;
            c= a + b;
        return c;
    }
    public static int restar (int a, int b){
        int c;
            c= a-b;
        return c;
    }
    public static int multiplicar(int a, int b){
        int c;
            c= a * b;
        return c;
    }

    public static float dividir(float a, float b){
        float c;
            c= a/ b;
        return c;
    }
}

