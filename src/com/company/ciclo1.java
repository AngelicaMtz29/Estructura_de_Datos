package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 14/09/2017.
 */
public class ciclo1 {
    public static void main(String[] args){
        Scanner cicl=new Scanner(System.in);
        boolean continuar=true;

        while(continuar){
            System.out.println("Ingrese una letra");
            String let=cicl.nextLine();
            switch(let){
                case "a": case "A":
                    System.out.println("Seleccionó A");
                    break;
                case "b": case"B":
                    System.out.println("Seleccionó B");
                    break;
                case "c": case"C":
                    System.out.println("Seleccionó C");
                    break;
                default:
                    System.out.println("Solo se aceptan A, B, C");
                    continuar=false;
            }
        }
    }
}
