package com.mycompany.ejercicioestacionamiento;

import java.util.Scanner;

public class EjercicioEstacionamiento {

    public static void main(String[] args) {

        //Variables
        String patente = "";
        int tipoServicio, cantHoras;
        int cont1 = 0, cont2 = 0, cont3 = 0;
        double total, totalDia = 0;
        Scanner teclado = new Scanner(System.in);

        while (!patente.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese la patente de su vehiculo");
            patente = teclado.nextLine();

            if (!patente.equalsIgnoreCase("fin")) {
                System.out.println("Ingrese el tipo de servicio");
                System.out.println("1- Por hora.");
                System.out.println("2- Media jornada");
                System.out.println("3- Jornada completa");

                // Utilizamos la misma variable pero creamos una nueva instancia ya que para pedir tipoServicio el valor es un int
                teclado = new Scanner(System.in);
                tipoServicio = teclado.nextInt();

                if (tipoServicio > 3 || tipoServicio <= 0) {
                    System.out.println("Debe ingresar un valor correcto de servicio");
                } else {
                    if (tipoServicio == 1) {
                        System.out.println("Ingrese la cantidad de horas que desea estacionar");
                        cantHoras = teclado.nextInt();
                        total = cantHoras * 3;
                        System.out.println("El total de su estacionamiento es de: " + total);
                        cont1++;
                        totalDia += total;
                    } else {
                        if (tipoServicio == 2) {
                            System.out.println("Usted ingreso media jornada");
                            total = 15 - (15 * 0.05);
                            System.out.println("El total de su estacionamiento es de: " + total);
                            cont2++;
                            totalDia += total;
                        } else {
                            System.out.println("Usted ingreso jornada completa");
                            total = 30 - (30 * 0.10);
                            System.out.println("El total de su estacionamiento es de: " + total);
                            cont3++;
                            totalDia += total;
                        }
                    }
                }
                System.out.println("***Muchas gracias por su compra***");

                // Reseteo de scanner para no tener errores al resetear el bucle
                teclado = new Scanner(System.in);
            }
        }

        System.out.println("========================================");
        System.out.println("Totales monetarios del dia:");
        System.out.println("Cantidad servicios por hora: " + cont1);
        System.out.println("Cantidad servicios media jornada: " + cont2);
        System.out.println("Cantidad servicios jornada completa: " + cont3);
        System.out.println("El total recaudado en el dia es de: " + totalDia);
    }
}
