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
    public void update(T data) {
        if (data instanceof List<?>) {
            List<?> lista = (List<?>) data;
            for (Object item : lista) {
                if (item instanceof Dato) {
                    Dato dato = (Dato) item;
                    imprimir(dato.toList());
                }
            }
        }
    }

    protected abstract void imprimir(List<Object> datos);
}
