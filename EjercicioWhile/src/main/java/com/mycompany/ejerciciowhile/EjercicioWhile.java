
package com.mycompany.ejerciciowhile;

import java.util.Scanner;

public class EjercicioWhile {

    public static void main(String[] args) {
        
        // Ejemplo sencillo de while
        /*int contador = 0;
        
        while(contador < 10){
            System.out.println("Vamos por la vuelta "+contador);
            contador++;
        }*/
        
        // Ejemplo de bucle while controlado por centinela o flag
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        
        while(bandera == true){
            System.out.println("El valor de la bandera es " + bandera);
            System.out.println("Estas actualmente suscrito? " + bandera);
            
            System.out.println("Queres desuscribirte?");
            respuesta = teclado.next();
            
            if(respuesta.equals("si")){
                bandera = false;
                System.out.println("Ya realizaste la desuscripcion.");
            }    
        }
        
        
    }
}
