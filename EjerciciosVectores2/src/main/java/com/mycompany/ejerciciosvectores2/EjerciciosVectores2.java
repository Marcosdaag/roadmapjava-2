
package com.mycompany.ejerciciosvectores2;
    
import java.util.Scanner;

public class EjerciciosVectores2 {

    public static void main(String[] args) {
        String nombres [] = new String [8];
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i<nombres.length; i++){
            System.out.println("Ingrese el nuevo valor");
            nombres[i] = teclado.next();
        }
        
        for(int i=0; i<nombres.length; i++){
            System.out.println("Lista final de nombres");
            System.out.println("El nombre en la posicion "+i+" es "+nombres[i]);
        }
    }
}
