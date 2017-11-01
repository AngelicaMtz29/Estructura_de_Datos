package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 13/09/2017.
 * Escribir un program para calcular el numero de vocales de una cadena
 * (se cuentan vocales repetidas)
 */
public class Vocales {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);//Se crea el objeto Scanner
        String palabra;//Se declara la varible que almacena la información ingresada por el usuario
        System.out.println("Ingrese una palabra u oración: ");//Se solicita la información
        palabra=sc.nextLine();//se almacena la información en la variable anterior. Se utiliza el next() para
        System.out.println("Cantidad de vocales: " + numvocales(palabra));//Se muestra la información haciendo uso del método numvocales.

    }

    public static int numvocales(String palabra){//Método que recibe de parametro la información almacenada en la variable palabra.
        char[] VPalabra = palabra.toCharArray();//El método toCharArray copia cada carácter en una cadena, a una matriz de caracteres.
        int cant=0;//se inicializa la variable cant, donde se almacenará la cnatidad de vocales que tiene la palabra ingresada.
        for (int x=0;x<VPalabra.length;x++) { //El ciclo for recorrera cada elemento del vector hasta enontrar alguno de los valores que se especifican en la condición siguiente.
            switch (VPalabra[x]) {//La sentencia Switch se emplea mediante casos que han de realizar sus instrucciones si se utiliza la opción.
                //En cada caso se especifica: si se encuentra alguna vocal, en minuscula o mayuscula, se aumenta uno a la variable cant.
                case 'a':
                case 'A':
                    cant++;
                    break;//el break permite terminar con el caso y agregar lo que corresponde.
                case 'e':
                case 'E':
                    cant++;
                    break;
                case 'i':
                case 'I':
                    cant++;
                    break;
                case 'o':
                case 'O':
                    cant++;
                    break;
                case 'u':
                case 'U':
                    cant++;
                    break;
                }
            }
        //como es un metodo con un tipo de dato especifico, tendrá que devolver un valor
        // del mismo tipo en este caso entero, por lo tanto devuelve la cantidad(cant)
        return cant;
        }
    }


