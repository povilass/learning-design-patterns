package module.observer.display;


import module.observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Povilas on 2015.07.07.
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0F;
    private float minTemp = 200.0F;
    private float tempSum = 0.0F;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            float temp = weatherData.getTemperature();
            this.tempSum += temp;
            ++this.numReadings;
            if(temp > this.maxTemp) {
                this.maxTemp = temp;
            }

            if(temp < this.minTemp) {
                this.minTemp = temp;
            }

            this.display();
        }

    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + this.tempSum / (float)this.numReadings + "/" + this.maxTemp + "/" + this.minTemp);
    }
}
