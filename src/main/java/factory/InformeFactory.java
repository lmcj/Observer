
package factory;

import dominio.InformeConsola;
import dominio.InformeGraficos;
import dominio.InformeTabla;
import modelo.Dato;
import patronObserver.Gestion;
import patronObserver.Informe;

public class InformeFactory {

    public static Informe<Dato> crearInformeConsola(Gestion<Dato> dataSource) {
        return new InformeConsola<>(dataSource);
    }

    public static Informe<Dato> crearInformeGraficos(Gestion<Dato> dataSource) {
        return new InformeGraficos(dataSource);
    }

    public static Informe<Dato> crearInformeTabla(Gestion<Dato> dataSource) {
        return new InformeTabla(dataSource);
    }
}
