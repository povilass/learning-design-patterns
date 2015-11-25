package module.observer;

import java.util.ArrayList;

/**
 * Created by Povilas on 2015.07.08.
 */
public class WeatherData implements Subject {
    private ArrayList observers = new ArrayList();
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = this.observers.indexOf(o);
        if(i >= 0) {
            this.observers.remove(i);
        }

    }

    public void notifyObservers() {
        for(int i = 0; i < this.observers.size(); ++i) {
            Observer observer = (Observer)this.observers.get(i);
            observer.update(this.temperature, this.humidity, this.pressure);
        }

    }

    public void measurementsChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}

