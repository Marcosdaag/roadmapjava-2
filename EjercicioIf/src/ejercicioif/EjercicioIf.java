package ejercicioif;

import java.util.Scanner;

public class EjercicioIf {


    public static void main(String[] args) {
        //Validador de edad
        int edad;
        
        // Nueva instancia de Scanner
        Scanner validador = new Scanner(System.in);
        
        System.out.println("Ingrese su edad");
        edad = validador.nextInt();
        
        // Condicional anidado
        if(edad > 18){
            System.out.println("El usuario es mayor de edad");
        }
        else {
            if(edad == 18){
                System.out.println("El usuario tiene 18");
            }
            else {
                System.out.println("El usuario es menor de edad");
            }
        }
    }
    
}
