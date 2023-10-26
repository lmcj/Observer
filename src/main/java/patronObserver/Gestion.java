
package patronObserver;

import java.util.ArrayList;
import java.util.List;

public class Gestion<T> implements DataSource<T> {
    private List<Observer<T>> observers = new ArrayList<>();
    private List<T> data;

    @Override
    public void addObserver(Observer<T> observer) {
        observers.add(observer);
    }

    @Override
    public void eleminarObserver(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer<T> observer : observers) {
            observer.actualizar((T) data);
       }
    }

    @Override
    public void setData(List<T> data) {
        this.data = data;
        notificarObservers();
    }
}