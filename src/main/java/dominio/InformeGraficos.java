
package dominio;

import java.util.List;
import patronObserver.Gestion;
import patronObserver.Informe;

public class InformeGraficos<T> extends Informe<T> {

    public InformeGraficos(Gestion<T> dataSource) {
        super(dataSource);
    }

    @Override
    protected List<Object> almacenar(List<Object> datos) {
        return datos;
    }
}
