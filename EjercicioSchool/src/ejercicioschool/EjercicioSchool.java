
package ejercicioschool;

import java.util.Scanner;

public class EjercicioSchool {

    public static void main(String[] args) {
        System.out.println("Bienvenido a la escuela de ingles.");
        System.out.println("Ingrese la edad del estudiante para consultar horarios.");
        
        int edad;
        
        Scanner teclado = new Scanner(System.in);
        
        edad = teclado.nextInt();
        
        if(edad >= 4 && edad <=6){
            System.out.println("El horario del alumno es Lunes y Miercoles de 16 a 17");
        }
        else{
                if(edad >=7 && edad <=8){
                System.out.println("El horario del alumno es Martes y Jueves de 16:30 a 17:30");
                 }
                else if(edad >=9 && edad <=10){
                    System.out.println("El horario del alumno es Martes y Jueves de 17:30 a 19:00");
                }
                else if(edad >=11 && edad <=13){
                    System.out.println("El horario del alumno es Lunes y Miercoles de 17 a 18:30");
                }
                else{
                    System.out.println("Ingrese una edad valida");
                }
        }
            
    }
    
}
