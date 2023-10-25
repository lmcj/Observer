
package factory;

import patronObserver.Gestion;

public class GestionFactory {
    public static <T> Gestion<T> crearGestion() {
        return new Gestion<>();
    }
}

