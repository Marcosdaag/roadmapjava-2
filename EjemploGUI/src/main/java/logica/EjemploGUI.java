package logica;

import gui.Principal;

public class EjemploGUI {

    public static void main(String[] args) {
        
        //hacer visible la interfaz grafica
        //instancio una clase "Principal" que hace referencia a mi interfaz
        Principal ventana = new Principal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }
}
