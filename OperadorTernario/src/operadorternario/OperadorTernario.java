
package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        
        /*Progrma que dependiendo del promedio de notas
        nos diga si el alumno desaprobo o no*/
        
        // Variables necesarias
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        
        // Ingreso de datos
        System.out.println("Ingresa el promedio de notas");
        promedio = teclado.nextDouble();
        
        // Operador ternario: evalua una condicion y devuelve true o false asignando un valor
        condicionFinal = (promedio >= 6) ? "Aprobado" : "Desaprobado";
        System.out.println("La condicion del alumno es " + condicionFinal);
    }
}
