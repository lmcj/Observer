
package dominio;

import java.util.List;
import patronObserver.Gestion;
import patronObserver.Informe;

public class InformeConsola<T> extends Informe<T> {

    public InformeConsola(Gestion<T> dataSource) {
        super(dataSource);
    }

    @Override
    protected List<Object> almacenar(List<Object> datos) {
        return datos;
    }
}

