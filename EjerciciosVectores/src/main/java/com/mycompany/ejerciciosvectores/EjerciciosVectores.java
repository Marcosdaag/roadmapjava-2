package com.mycompany.ejerciciosvectores;

import java.util.Scanner;

public class EjerciciosVectores {

    public static void main(String[] args) {
        String nombres[] = new String [8];
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i<8; i++){
            System.out.println("Ingresa el proximo nombre a agregar");
            nombres[i] = teclado.next();
        }
        
        for(int i=0; i<nombres.length; i++){
            System.out.println("El nombre del indice "+ i +" es "+nombres[i]);
        }
    }
}
