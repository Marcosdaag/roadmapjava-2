package com.mycompany.ejerciciovectores5;

import java.util.Scanner;

public class EjercicioVectores5 {

    public static void main(String[] args) {
        int sueldoTotal = 0;
        int sueldoMensual;
        double promedio;
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<12; i++){
            System.out.println("Ingrese su sueldo del mes "+(i+1));
            sueldoMensual = teclado.nextInt();
            sueldoTotal += sueldoMensual;
            sueldoMensual = 0;
        }
        
        System.out.println("El sueldo anual es de "+sueldoTotal+" y su promedio es de "+(sueldoTotal/12));
        
    }
}
