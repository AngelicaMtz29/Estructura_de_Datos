package com.company;

import java.util.Scanner;

public class FuncionG {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        int x, y;
        System.out.println("Ingrese valor de x: ");
        x = s1.nextInt();
        System.out.println("Ingrese valor de y: ");
        y = s1.nextInt();
        System.out.println("Ackerman (" + x + "," + y + ") = " );
    }
}
