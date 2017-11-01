import java.util.Scanner;

public class Ejemplo {
    public static void main(String []args){
        int[][] calificaciones = new int[3][3];

        /*
        Si se especifican los valores de las columnas se pueden mostrar
        recorrer filas
        numero de filas>>calificaciones.length
        ---Para llenarlo---

        for (int f=0;f<calificaciones.length; f++){
            System.out.println("Fila "+ f);
            for (int c=0;c<calificaciones[f].length; c++){
                System.out.println("Columna "+ c);
            }
        }*/
        /*
        recorrer columnas de una fila
        calificaciones[0].length>>numero de columnas de la fila 0
         */

        //
        Scanner sc= new Scanner(System.in);

        for (int f=0;f<calificaciones.length; f++){
            System.out.println("Alumno "+ f);
            for (int c=0;c<calificaciones[f].length; c++){
                System.out.println("Calificacion "+ c);
               calificaciones[f][c]=sc.nextInt();
            }
        }
        for (int f=0;f<calificaciones.length; f++){
            System.out.println("\nAlumno "+ f + "\t");
            int sum=0;

            for (int c=0;c<calificaciones[f].length; c++){
                System.out.println("Calificacion "+ c);
                System.out.print(calificaciones[f][c] + "\t");
                sum+=calificaciones[f][c];
            }
            System.out.print(sum/3.0);
        }
    }
}
