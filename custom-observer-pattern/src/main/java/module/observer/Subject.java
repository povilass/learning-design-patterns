package module.observer;

/**
 * Created by Povilas on 2015.07.08.
 */
public interface Subject {
    void registerObserver(Observer var1);

    void removeObserver(Observer var1);

    void notifyObservers();
}
