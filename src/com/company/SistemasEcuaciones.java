package com.company;

import java.util.Scanner;

/**
 * Created by Angie on 13/09/2017.
 */
public class SistemasEcuaciones {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número: ");
        n=sc.nextInt();
        System.out.println("¿Es un numero impar? ");
        System.out.println(impar(n));

    }

    public static boolean impar (int n)
    {if (n==0)
        return false;
    else
        return par(n-1);
    }
    public static boolean par(int n)
    {if (n==0)
        return true;
    else
        return impar(n-1);
    }
}