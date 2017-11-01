package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 13/09/2017.
 */
public class Palindromo {

    public static void main(String []args){
        //Se solicita información al usuario usando el teclado mediante Scanner
        //Para ello se crea un objeto de esta clase
        Scanner sc= new Scanner(System.in);
        //Se solicita que ungrese una palabra
        System.out.println("Ingrese una palabra: ");
        /*Se almacena en la variable palabra que asi mismo
        * se declara como una variable de tipo String y se obtiene la información hasta encontrar
        * un espacio mediante el metodo next();
        */
        String palabra=sc.next();
        System.out.println("¿La palabra ingresado es un palindromo? "); ;
        /*Una vez obtenido el valor del método VoF
        se realiza la siguiente condición:
        Si es falso, es un palindromo de lo contrario no lo es.
         */
        if (VoF(palabra)==false){
            //Se muestra a pantalla la respuesta dependiendo el caso
            System.out.println(palabra + " si es un palindromo"); ;
        }else {
            System.out.println(palabra + " no es un palindromo");
        }

    }
    //Se crea el método VoF para declarar si la palabra ingresada es o no un palindromo.
    public static boolean VoF(String palabra) {
        /*
        El metodo compara los caracteres de la cadena mediante otro método llamado charAt
        para lo cual se necesitan dos variables, que representan las posiciones o el indice de la cadena.
         */
        //Declaración de variables:
        //La variable asc de tipo entero se inicializa en cero porque es la primera posición del indice de la cadena.
        int asc = 0;
        //La  variable desc de tipo entero representa a la longitud de la palabra-1, que es igual al valor d la ultima posición de la cadena.
        int des = palabra.length() - 1;
        //La variable error de tipo boleano se utilizará en la condición
        boolean es = false;

        /*
        El siguiente ciclo While realiza lo siguiente:
        -Manipula las posiciones del indice de la cadena.
        Mientras sea verdadera la condición de que el indice inicial sea menor al indice final y
        el resultado sea diferente del valor de la variable es =verdadero,
        De otra forma(verdadero)&&(verdadero)=verdadero, se continua con la sentencia, que en el método incluye a la
        condición if
         */
        while ((asc < des) && (!es)) {
            /*
            Esta condición declara:
            Si el valor de la palabra en la posición asc=0 es igual al valor de la palabra en la posición des(ultima posición).
             */
            if (palabra.charAt(asc) == palabra.charAt(des)) {
                //La variable asc aumentará en 1.
                asc++;
                //La variable des disminuirá 1.
                des--;
            } else {
                /*Si la condición no se cumple devolverá el valor de es como verdadero,
                lo cual determinará que la palabra no es un palindromo
                */
                return es=true;

            }

        }
        /*Siendo un método de tipo booleano devolverá un valor del mism tipo,
        en este caso falso.
        */
        return es;
    }

}
