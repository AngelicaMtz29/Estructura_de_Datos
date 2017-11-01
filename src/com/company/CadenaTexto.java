package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Angie on 05/09/2017.
 */
public class CadenaTexto {

    public static void main(String[] args)  throws ParseException {
        String nombre, apep, apem, entrada;
        Scanner sc= new Scanner(System.in);
        //nextLine:Lee una cadena de texto con espacios o enter. Next: Lee hasta donde encuentra un espacio.
        //Solicitud de datos
        System.out.print("Introduce tu nombre: ");
        nombre=sc.nextLine();
        System.out.print("Introduce tu apellido paterno: ");
        apep=sc.nextLine();
        System.out.print("Introduce tu apellido materno: ");
        apem=sc.nextLine();
        System.out.println();
        System.out.println("Tu nombre es: " + nombre + " " + apep + " " + apem);
        System.out.println();
        System.out.println("Introduce tu fecha de nacimiento Dia-Mes-Año");
        entrada=sc.nextLine();
        //Se especifica el formato de fecha a utilizar
        SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
        //conversión de la fecha ingresada al formato de fecha especificado
        Date fecha = format.parse(entrada);
        //Resultado de la edad, se implementa el método de igual nombre
        if(edad(fecha)>0){
            System.out.println("Su edad es: " + edad(fecha));
        }else{
            System.out.println("Datos incorrectos, verifique");
        }


    }
        //Métodos que devuelven en formato numérico cada parte de la fecha ingresada
    public static int dia(Date fecha){
        int dia=0;
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd");
        if(dia>=1 && dia<=31){
            return dia= Integer.parseInt(dateFormat1.format(fecha));
        }else{
            return dia;
        }
    }
    public static int mes(Date fecha){
        int  mes=0;
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM");
        if(mes>=1 && mes<=12){
            return mes= Integer.parseInt(dateFormat2.format(fecha));
        }else {
            return mes;
        }

    }
    public static int años(Date fecha){
        int  años;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        return años= Integer.parseInt(dateFormat.format(fecha));
    }

    //Haciendo uso de los anteriores métodos, y la fecha del sistema se realizan las operaciones correspondientes
    public static int edad(Date fecha) {

        Date fecha_sistema=new Date();
        DateFormat format1= new SimpleDateFormat("dd-MM-yyyy");

        //formatos
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd");
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");

            int añoS=Integer.parseInt(dateFormat.format(fecha_sistema));
            int diaS= Integer.parseInt(dateFormat1.format(fecha_sistema));
            int mesS= Integer.parseInt(dateFormat2.format(fecha_sistema));
            /*Pruebas--System.out.println(format1.format(fecha_sistema));
            System.out.println(añoS + " " + mesS + " " + diaS);*/
            int years=añoS-años(fecha);
            int edad=0;
            //Condicion para calcular edad

            if(dia(fecha)<=0 && mes(fecha)<=0){
                return edad = 0;

            }else if(dia(fecha)>=diaS && mes(fecha)>=mesS) {
                return edad= years-1;
            }else {
                return years;
            }
        }


    }

