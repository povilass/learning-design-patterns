package module.observer.display;


import module.observer.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Povilas on 2015.07.07.
 */
public class ForecastDisplay implements DisplayElement, Observer {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);

    }
    public void display() {
        System.out.print("Forecast: ");
        if(this.currentPressure > this.lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if(this.currentPressure == this.lastPressure) {
            System.out.println("More of the same");
        } else if(this.currentPressure < this.lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
