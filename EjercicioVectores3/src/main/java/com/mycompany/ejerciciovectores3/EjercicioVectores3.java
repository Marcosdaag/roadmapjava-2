package com.mycompany.ejerciciovectores3;

import java.util.Scanner;

public class EjercicioVectores3 {

    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero que desea agregar");
            numeros[i] = teclado.nextInt();
        }

        //busqueda del mayor
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < mayor) {
                menor = numeros[i];
            }
        }
        
        System.out.println("El numero mas grande el array es " + mayor);
        System.out.println("El numero mas chico el array es " + menor);
    }
}
