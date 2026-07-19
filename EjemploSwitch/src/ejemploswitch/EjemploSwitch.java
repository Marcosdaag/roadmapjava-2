
package ejemploswitch;

import java.util.Scanner;

public class EjemploSwitch {

    public static void main(String[] args) {
        // Declaracion de variable
        int day;
        String nameOfDay;
        
        System.out.println("Ingrese un numero del 1 al 7");
        
        Scanner teclado = new Scanner(System.in);
        
        day = teclado.nextInt();
        
        // Estructura basica del switch
//        switch (day){
//            case 1: nameOfDay="Lunes";
//                break;
//            case 2: nameOfDay="Martes";
//                break;
//            case 3: nameOfDay="Miercoles";
//                break;
//            case 4: nameOfDay="Jueves";
//                break;
//            case 5: nameOfDay="Viernes";
//                break;
//            case 6: nameOfDay="Sabado";
//                break;
//            case 7: nameOfDay="Domingo";
//                break;
//            default: nameOfDay="Dia incorrecto";
//        }
        
        // Forma de hacer un switch mas eficiente2
        nameOfDay = switch (day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia incorrecto";
        };
        
        System.out.println("El dia de la semana es "+ nameOfDay);
    }
    
}
