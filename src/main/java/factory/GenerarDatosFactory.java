
package factory;

import modelo.GenerarDatos;

public class GenerarDatosFactory {
    public static GenerarDatos crearGenerarDatos() {
        return new GenerarDatos();
    }
}
