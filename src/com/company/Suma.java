package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 13/09/2017.
 * Crear un programa que devuelva la suma de los primeros n numeros enteros que el usuario ingrese
 */
public class Suma{

        public static void main(String [] a)
        {    //Se solicita información al usuario usando el teclado mediante Scanner
            //Para ello se crea un objeto de esta clase
            Scanner sc= new Scanner(System.in);
            //Se solicita que ingrese la infornación
            System.out.println("Ingrese un número entero");
            //Se almacena la infpormación
            int numfinal=sc.nextInt();
            //Se muestra el resultado por medio del método.
            System.out.println("El resultado de los primeros " + numfinal + " números, es igual a "+ Gauss(numfinal));

        }

        static int Gauss(int numfinal) {
            /*
            Este método obtiene el valor ingresado medinte la formula de Gauss=(n(n+1))/2
            que realiza las operaciones siguientes:
            suma 1 al numero ingresado
            multiplica el resultado nuevamente por el numero ingresado
            y lo divide entre dos.
            Almacena el resultado final en la variable suma.
             */

            int suma=((numfinal+1)*numfinal/2);

            /*
            Como se trata de un método con un tipo de dato especificado
            se tiene que devolver un resultado, en este caso el valor de la suma.
             */
            return suma;

        }


}
