
package patronObserver;

import java.util.List;

public interface DataSource<T> {
    void addObserver(Observer<T> observer);
    void eleminarObserver(Observer<T> observer);
    void notificarObservers();
    void setData(List<T> data);
}

