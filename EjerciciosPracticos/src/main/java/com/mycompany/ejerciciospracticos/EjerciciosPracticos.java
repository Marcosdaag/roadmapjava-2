package com.mycompany.ejerciciospracticos;

import java.util.Scanner;

public class EjerciciosPracticos {

    public static void main(String[] args) {
        /*Realizar un programa que muestre en pantalla los numeros del 1 al 35 (utilizar estructura repetitiva)*/
        /*for (int contador = 0; contador <35; contador ++){
            System.out.println("Contador por el numero " + (contador+1));
        }*/
        
        /*Realiar un programa que dado por teclado un limite numerico muestre en pantalla todos los numeros hasta ese
        limite empezando por 1*/
        /*int limite;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero al que desea llegar");
        limite = teclado.nextInt();
        
        for (int contador = 0; contador<limite; contador++){
            System.out.println("Vamos por la vuelta " + (contador+1));
        }*/
        
        /*Realizar un programa que muestre por pantalla los numeros numeros del 200 al 250 saltando de 2 en 2*/
        /*int contador = 200;
        while (contador <= 250){
            System.out.println("Vamos por el numero " + contador);
            contador += 2;
        }*/

        /*Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo, la cuenta debe comenzar en 10 y terminar en 1*/
        /*for (int cuentaReg = 10; cuentaReg>=0; cuentaReg--){
            System.out.println("Cuenta regresiva para el año nuevo " + cuentaReg);
        }*/
        
        /*Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingrese la palabra salir*/
        String ingreso;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingresar la palabra a mostrar");
        ingreso = teclado.next();
        
        while(!ingreso.equalsIgnoreCase("SALIR")){
            System.out.println("La palabra es "+ingreso);
            
            System.out.println("Ingresar la palabra a mostrar");
            
            ingreso = teclado.next();
        }
        
    }
}
