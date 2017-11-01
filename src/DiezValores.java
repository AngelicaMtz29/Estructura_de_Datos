import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class DiezValores {

    public static void main(String[] args) {
        //Crear el arreglo que almacenará los valores ingresados
        int[] array1 = new int[10];

        //Se crea un objeto de la clase Scanner.
        Scanner sc = new Scanner(System.in);
        /*
        Mediante el ciclo for:
        Se solicitará que ingrese los valores, de tipo entero, para el arreglo y mediante el método nextInt(),
        que es parte de la clase Scanner, se leeran, por ello se crea el objeto que permite el uso del método anterior.
        Se almacenan en la variable valor y cada uno de ellos se agregan al arreglo que se habia creado antes, segun
        la posición que les corresponde y que define el ciclo.
        array1.length permite conocer la longitud del arreglo, mismo numero de veces que será ejecutado el ciclo.
         */
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Ingrese el valor numérico del elemento " + i + ": ");
            int valor = sc.nextInt();
            array1[i] = valor;
        }

        /*
        Se verifica que los valores se encuentren dentro del arreglo
        for (int i = 0; i < array1.length; i++){
            System.out.print(array1[i]+ "|");
        }*/
        //Se agrega un encabezado que permitirá definir las columnas
        System.out.print("Elemento      Valor   Histograma");

        /*
        Forma de solución con un metodo recursivo
        for (int ind = 0; ind < array1.length; ind++) {
            System.out.println();
            System.out.print(ind +"       " + array1[ind] );
           System.out.print("           ");
            ast(array1[ind]);

        }*/
        /*
        Forma de solución mediante un ciclo for que genera la secuencia de asteriscos.
        Lo que permite el ciclo es:
        Recorrer cada una de las posiciones del vector y mostrarlas mediante una lista que será acompañada
        por el valor de la esa posición. Además de contener otro ciclo que permite representar el valor, de la posición
        que designa el primer ciclo, mediante asteriscos.
        Notas: array1[ind] = obtiene el valor del array1 en la posición indicada.
        \n permite el salto de linea
         */
        for (int ind = 0; ind < array1.length; ind++) {
            System.out.println();
            System.out.print("   " + ind +"           " + array1[ind]);
            System.out.print("       ");
            for (int i=0; i<array1[ind];i++){
                System.out.print("*");
            }


        }
    }
    static void ast(int val){

        if(val>0){

            ast(val-1);
            System.out.print('*');
        }



    }
}




