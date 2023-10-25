
package main.observer;

import controlador.Controlador;
import factory.ControladorFactory;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Controlador controlador = ControladorFactory.crearControlador();
        controlador.iniciar();
    }
}

