package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 13/09/2017.
 */
public class Tabla {

    public static void main(String [] args){
        //Se solicita información al usuario usando el teclado mediante Scanner
        //Para ello se crea un objeto de esta clase
        Scanner sc=new Scanner(System.in);
        System.out.println("Tabla de multiplicar, del número: ");
        //Se almacena la información en la variable entero numero
        int numero=sc.nextInt();
        /*
        Se solicita más información y se almacena en otra variable llamada ultmnum
         */
        System.out.println("Del 0 al: ");
        int ultnum=sc.nextInt();
        /*
        Se llama al método Tabla donde:
        numero es el numero de la tabla
        ultnum es el ultimo valor de la tabla.
        Ambos son factores de la multiplicación
         */
        Tabla(numero,ultnum);
    }

    //El método Tabla utiliza los valores solicitados
    public static void Tabla(int numero, int ultnum) {
        /*
        Si la siguiente condición es verdadera, ya que el ultnum es mayor o igual de 1
        y este mismo es diferente de -1...
         */

        if (ultnum>=1 && ultnum!=-1){
            /*
            ...Se llama al mismo método y se resta uno al valor del ultnum
             */
            Tabla(numero,ultnum-1);

        }
        /*
        Se declara la variable que almacena el valor de la multiplicación de ambos factores: numero y ultnum.
        Y se imprime a pantalla.
         */
        int result=numero * ultnum;
        System.out.println(numero + " x " + ultnum + " = " + result);

    }

 }