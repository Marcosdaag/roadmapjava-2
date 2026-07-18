package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        // Scanner es la clase que permite leer las entradas
        Scanner teclado = new Scanner(System.in);
        
        // Declaracion de variables
        int num1,num2,suma;
        
        // Texto 
        System.out.println("Ingresa el primer numero a sumar");
        num1 = teclado.nextInt();
        
        System.out.println("Ingresa el segundo numero a sumar");
        num2 = teclado.nextInt();
        
        suma = num1+num2;
        
        System.out.println("El resultado es "+suma);
        
    }
    
}
