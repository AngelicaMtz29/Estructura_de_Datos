package com.company;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * Created by Angie on 06/09/2017.
 */
public class CadenaTexto2 {


        public static void main(String[] args) throws ParseException {
            String nombre, apep, apem, entrada;
            Scanner sc= new Scanner(System.in);
            //nextLine:Lee una cadena de texto con espacios o enter.
            //next: Lee hasta donde encuentra un espacio.
            System.out.print("Introduce tu nombre: ");
            nombre=sc.nextLine();
            System.out.print("Introduce tu apellido paterno: ");
            apep=sc.nextLine();
            System.out.print("Introduce tu apellido materno: ");
            apem=sc.nextLine();
            System.out.println();
            System.out.println("Tu nombre es: " + nombre + " " + apep + " " + apem);
            System.out.println();
            //Valor númerico de la fecha

            System.out.println("Introduce tu fecha de nacimiento Dia-Mes-Año");
            entrada=sc.nextLine();
            SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");

            Date fecha =format.parse(entrada);
            //formatos
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd");
            SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

            //valores numericos de la fecha ingresada
            int dia= Integer.parseInt(dateFormat1.format(fecha));
            int mes= Integer.parseInt(dateFormat2.format(fecha));
            int año= Integer.parseInt(dateFormat.format(fecha));

            // Pruebas--System.out.println(año + " " + mes + " " + dia);

            //----Valor númerico del sistema---
            Date fecha_sistema=new Date();

            int añoS=Integer.parseInt(dateFormat.format(fecha_sistema));
            int diaS= Integer.parseInt(dateFormat1.format(fecha_sistema));
            int mesS= Integer.parseInt(dateFormat2.format(fecha_sistema));
         /*Pruebas--System.out.println(format1.format(fecha_sistema));
        System.out.println(añoS + " " + mesS + " " + diaS);*/
            int years=añoS-año;
            //Condicion para calcular edad
            if(dia>=diaS && mes>=mesS){

                int edad= years-1;
                System.out.println("Su edad es: "+ edad);
            }else {

                System.out.println("Su edad es: "+ years);
            }


        }

    }

