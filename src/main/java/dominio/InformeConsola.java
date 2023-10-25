
package dominio;

import java.util.List;
import patronObserver.Gestion;
import patronObserver.Informe;

public class InformeConsola<T> extends Informe<T> {

    public InformeConsola(Gestion<T> dataSource) {
        super(dataSource);
    }

    @Override
    protected void imprimir(List<Object> datos) {
        System.out.println("InformeConsola: " + datos);
    }
}

