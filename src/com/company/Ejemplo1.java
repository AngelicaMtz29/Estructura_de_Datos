package com.company;

/**
 * Created by Angie on 13/09/2017.
 */
public class Ejemplo1 {
    public static void main(String[] args) {

        loge();


    }
    static public double loge()
    {
        double enl, delta, fact;
        int n;
        enl = fact = delta = 1.0;
        n = 1;
        do
        {
            enl += delta;
            n++;
            fact *= n;
            delta = 1.0 / fact;
        } while (enl != enl + delta);
        return enl;
    }

}
