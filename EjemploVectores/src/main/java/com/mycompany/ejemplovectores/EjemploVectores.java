package com.mycompany.ejemplovectores;

import java.util.Scanner;

public class EjemploVectores {

    public static void main(String[] args) {
        int numeros [] = new int [8];
        Scanner teclado = new Scanner(System.in);
        
        /*numeros[0] = 50;
        numeros[1] = 50;
        numeros[2] = 50;
        numeros[3] = 22;
        numeros[4] = 50;
        numeros[5] =15;
        numeros[6] = 50;
        numeros[7] = 50;
        */
        
        // mostrar el elemento de la tercera posicion osea INDEX 2
        // System.out.println("El elemento de la quinta posicion es: " + numeros[2]);
        
        // recorrido y carga de datos
        for (int i=0; i<numeros.length;i++){
            System.out.println("Ingrese el valor del indice "+i);
            numeros[i] = teclado.nextInt();
        }
        
        // recorrido y muestreo de datos
        System.out.println("Los valores ingresados fueron:");
        for (int i=0; i<numeros.length;i++){
            System.out.println("Indice "+ i + " tiene un valor de " + numeros[i]);
        }
        
    }
}
