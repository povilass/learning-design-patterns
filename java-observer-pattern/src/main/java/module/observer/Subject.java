package module.observer;

/**
 * Created by Povilas on 2015.07.02.
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
