
package com.mycompany.ejempromatriz;

import java.util.Scanner;

public class EjemproMatriz {

    public static void main(String[] args) {
        int matriz [][] = new int [3][3];
        Scanner teclado = new Scanner(System.in);
        
        // recorrido y carga de matrices
        /*
        El primer for es para las filas y el segundo para las columnas
        en el momento de poner matriz[0] elige la fila 0 y evalua su longitud
        para poder evaluar las columnas de manera correcta
        */
        for (int j=0; j < matriz.length ; j++){
            for (int c=0; c<matriz[0].length ; c++){
                System.out.println("Ingrese el valor para la fila "+j+" y la columna "+c);
                matriz [j][c] = teclado.nextInt();
            }
        }
        
        // recorrido y muestra
        for (int j=0; j < matriz.length; j++){
            for (int c=0; c<matriz[0].length ; c++){
                System.out.println("Fila "+j+" Columna "+c+" Valor "+matriz[j][c]);
            }
        }
    }
}
