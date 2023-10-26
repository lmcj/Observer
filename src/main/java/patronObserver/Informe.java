package patronObserver;

import java.util.List;
import modelo.Dato;

public abstract class Informe<T> implements Observer<T> {

    protected Gestion dataSource;

    public Informe(Gestion dataSource) {
        this.dataSource = dataSource;
        this.dataSource.addObserver(this);
    }

    @Override
    public void actualizar(T data) {
        if (data instanceof List<?>) {
            List<?> lista = (List<?>) data;
            for (Object item : lista) {
                if (item instanceof Dato) {
                    Dato dato = (Dato) item;
                    almacenar(dato.toList());
                }
            }
        }
    }

    protected abstract List<Object> almacenar(List<Object> datos);
}
