package com.mycompany.ejerciciovectores4;

import java.util.Scanner;

public class EjercicioVectores4 {

    public static void main(String[] args) {
        int cant3 = 0;
        int numeros[] = new int [10];
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<numeros.length; i++){
            System.out.println("Ingrese el numero a guardar");
            numeros[i] = teclado.nextInt();
        }
        
        for (int i=0; i<numeros.length; i++){
            if (numeros[i] == 3){
                cant3 ++;
            }
        }
        
        System.out.println("La cantidad de veces que ingreso el numero 3 es de "+cant3);
        
    }
}
