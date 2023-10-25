
package dominio;

import java.util.List;
import patronObserver.Gestion;
import patronObserver.Informe;

public class InformeTabla<T> extends Informe<T> {

    public InformeTabla(Gestion<T> dataSource) {
        super(dataSource);
    }

    @Override
    protected void imprimir(List<Object> datos) {
        System.out.println("InformeTabla: " + datos);
    }
}