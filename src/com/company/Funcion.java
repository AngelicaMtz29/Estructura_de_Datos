package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 14/09/2017.
 * Escribir un método recursivo que calcule la función de Ackermann definida de la siguiente forma:
 A(m, n) = n + 1 si m = 0
 A(m, n) = A (m – 1, 1) si m >0, y n = 0
 A(m, n) = A(m – 1, A(m, n – 1)) si m > 0, y n > 0
 */
public class Funcion {
    public static void  main(String[]args){
            /*
            Se solicita información al usuario usando el teclado mediante Scanner.
            Para ello se crea un objeto de esta clase.
            */
            Scanner s1 = new Scanner(System.in);
            //Se solicita los valores de x,y. Se almacenan en sus respectivas variables.
            System.out.println("Ingrese valor de x: ");
            int x = s1.nextInt();
            System.out.println("Ingrese valor de y: ");
            int y = s1.nextInt();
            //Se llama y se imprime el valor del método FuncionA
            System.out.println("Ackermann ("+ x + "," + y + ") = " +FuncionA(x,y));
    }

    //El siguiente método toma en cuenta las condiciones de la función de Ackermann
    public static int FuncionA(int x,int y) {
        //Si x es igual a 0 se suma 1 al valor de y.
        if (x == 0) {
            return y + 1;
            /*

            De lo contrario si el valor de x es mayor a 0 y el valor de y es igual a 0
            el valor de x disminuye en 1 y el valor de y cambia a 1.
             */
        } else if (x > 0 && y == 0) {
            return FuncionA(x - 1, 1);
            /*
            Sino, si el valor de x es mayor a 0 y el valor de y es mayor de 0:
            x disminuye en 1 y el valor de y es igual a la misma metodo FuncionA(x y restar 1 al valor de y).
             */
        } else if (x > 0 && y> 0) {
            return FuncionA(x - 1, FuncionA(x, y - 1));

        }
        //Siendo un método de valor entero, retorna el valor de la FuncionA
        return FuncionA(x,y);
    }
}
