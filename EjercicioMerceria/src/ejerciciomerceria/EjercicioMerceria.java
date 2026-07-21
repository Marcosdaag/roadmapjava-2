package ejerciciomerceria;

import java.util.Scanner;

public class EjercicioMerceria {

    public static void main(String[] args) {
        // Merceria mayorista
        // Menos de 5 paquetes NO vende
        // Entre 5 y 15 paquetes sale 10usd el envio
        // Mas de 15 paquetes no abona envio

        // Variables para la cantidad de paquetes y el Scanner
        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalDesc;
        Scanner teclado = new Scanner(System.in);

        // Mensaje e ingreso de cantidad
        System.out.println("Ingrese la cantidad de paquetes que desea comprar");
        cantidadPaquetes = teclado.nextInt();

        // Condicion
        if (cantidadPaquetes < 5) {
            System.out.println("No se permiten ventas minoristas (cantidad menor a 5)");
        } else {
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();

            if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {
                System.out.println("El envio tiene un costo de 10usd");
                montoTotal = +10;
            } else {
                System.out.println("El envio es gratis");
            }

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menos a 100 por lo que no posee promociones, usted requiere agregar $" + diferencia + " para llegar al primer descuento");
            } else {
                if (montoTotal >= 100 && montoTotal <= 300) {
                    descuento = montoTotal * 0.05;
                    totalDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5% y por su compra el total quedaria en " + totalDesc);
                } else {
                    descuento = montoTotal * 0.10;
                    totalDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 10% y por su compra el total quedaria en " + totalDesc);
                }

            }

        }

    }

}
