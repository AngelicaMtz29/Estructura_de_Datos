import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

import java.util.Arrays;
import java.util.Scanner;

public class Calificaciones {
    public static void main(String []args)
    {
        /*
        Crear:
        el arreglo bidimensional que almacenará las calificaciones ingresadas
        el objeto de la clase Scanner, que permitira leer unicamente los valores enteros ingresados.
        Solicitar las calificaciones de los alumnos.
         */
        int [][]control = new int[3][3];
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese sólo valores de tipo entero");

        /*
        El primer ciclo for recorre el número de filas mientras que el segundo
        recorre las columnas para que mediante estos valores puedan ser almacenadas las
        calificaciones que leerá el método nextInt() de la clase Scanner.
        Notas:
        control.length = número de filas de la matriz.
        control[fila].length = número de columnas de la matriz.
         */
        for(int fila=0; fila< control.length; fila++){
            //Permite especificar que alumno ingresará las calificaciones, según el orden
            System.out.println(fila+1 + "° "+ "Alumno");
            System.out.println();

            for(int columna = 0; columna<control[fila].length; columna++){
                System.out.print("Calificación  ");
                //Se alamacenan los valores en la matriz.
                control[fila][columna]= sc.nextInt();
            }

        }
        //Se especifican los encabezados de las tabla que contendrá las calificacione y el promedio.
        System.out.println("                    P1    P2    P3   ");
        System.out.println("                    [0]   [1]   [2]  ");

        /*
        Los ciclos realizan la misma función que los anteriores con la única diferencia que
        ya se muestra la matriz que se almaceno en el arreglo que se definia al inicio (control[][])
        y así mismo se calcula la suma de los valores por fila (o por alumno), despues de ello se obtiene el promedio
        de las calificaciones por alumno.
        El primer ciclo le permite al segundo sólo obtner la suma de los valores de cada fila.
         */
        for(int fila=0; fila< control.length; fila++){
            System.out.println();
            System.out.print("Calificación [" + fila + "]");
            System.out.print("     ");
            int suma=0;
            for(int columna = 0; columna<control[fila].length; columna++){
                System.out.print(control[fila][columna] + "    ");
                //Se suman las calificaciones por fila.
                suma+=control[fila][columna];
            }
            //Se declara variable que almacena el promedio, se calcula y se asigna.
            double promedio=suma/3.0;
            System.out.println("El promedio: "+(double)Math.round(promedio * 100d) / 100d);
        }
        /*
        La solución que se utiliza para obtener la calificación mayor y menor es:
        convertir el arreglo bidimensional a unidimensional y aplicar el método de ordenamiento llamado Burbuja.
        Para ello:
        Se crea el arreglo que mantendrá a los valores de la matriz de 3x3= 9 elementos.
        Se declara la variable pos que permitirá conocer en que posición del vector se almacenará el valor.
         */
        int vector[]=new int[9],pos;
        //El primer ciclo permitira recorrer las filas y el segundo las columnas.
        for (int f1=0; f1<control.length;f1++){
            for (int c1=0; c1<control[0].length;c1++){
                /*
                Para calcular el valor de la posición se realiza la siguiente operación:
                Multiplicar el número de columnas por la posición de la fila, más la posición de la columna.
                Despúes, se asigna el valor de la posición de la matriz, al vector con la posición que le corresponde.
                 */

                pos=((control[0].length)*f1)+c1;
                vector[pos]=control[f1][c1];
            }

        }
            /*
            Para asegurarnos que se realiza el ordenamiento correctamente, se muestra a continuación.
            Para identificar la calificación menor y mayor se especifica la primera
            y ultima posición del vector, respectivamente.
             */
             System.out.println("\n \n Vector ordenado: " + Arrays.toString(Ordenar(vector)));
            System.out.println("\n\n Calificación menor: "+vector[0]);
            System.out.println("Calificación mayor: "+vector[8]);


    }
    /*
    Se hace uso de un método de ordemaniento que obviamente ordenara al vector para poder obtener
     los resultados correspodientes.
     */
    public  static int[] Ordenar(int[] vector) {
        /*
        Para este método que emplea el método de ordenamiento Burbuja el cual compara todos los elementos
         de una lista contra todos, si se cumple que uno es mayor o menor a otro, entonces los intercambia de posición.
         */
        int buffer;
        int i,j;
        //Cada ciclo recorrerá al vector de  forma diferente
        for(i = 0; i < vector.length; i++)
        {
            for(j = 0; j < i; j++)
            {
                //Se emplea la comparación de valores
                if(vector[i] < vector[j])
                {
                    //De ser verdadera se realiza el inntercambio
                    buffer = vector[j];
                    vector[j] = vector[i];
                    vector[i] = buffer;
                }
            }
        }

        return vector;
    }
}
