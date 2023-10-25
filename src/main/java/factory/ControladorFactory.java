
package factory;

import controlador.Controlador;

public class ControladorFactory {
    public static Controlador crearControlador() {
        return new Controlador();
    }
}

