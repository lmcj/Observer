
package patronObserver;

import java.util.List;

public interface DataSource<T> {
    void addObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers();
    void setData(List<T> data);
}

