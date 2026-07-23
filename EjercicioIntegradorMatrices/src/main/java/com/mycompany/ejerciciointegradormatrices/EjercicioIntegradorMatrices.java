package com.mycompany.ejerciciointegradormatrices;

import java.util.Scanner;

public class EjercicioIntegradorMatrices {

    public static void main(String[] args) {
        double notas[][] = new double[4][3];
        double promedios[] = new double[4];
        Scanner teclado = new Scanner(System.in);

        // carga de las notas en la matriz
        for (int f = 0; f < notas.length; f++) {
            System.out.println("Ingrese las notas del alumno " + (f + 1));
            for (int c = 0; c < notas[0].length; c++) {
                notas[f][c] = teclado.nextDouble();
            }
        }

        // calcular los promedios
        double total;

        for (int f = 0; f < notas.length; f++) {
            total = 0;
            for (int c = 0; c < notas[0].length; c++) {
                total = total + notas[f][c];
            }
            promedios[f] = total / notas[0].length;
        }

        // mostrar las notas y el promedio de cada alumno recorriendo la matriz
        for (int f = 0; f < notas.length; f++) {
            System.out.println("Notas del alumno " + (f + 1));
            for (int c = 0; c < notas[0].length; c++) {
                System.out.println(notas[f][c]);
            }
            System.out.println("Promedio " + promedios[f]);
            System.out.println("----------------------------");
        }
    }
}
