package module.observer;

import module.observer.display.CurrentConditionsDisplay;
import module.observer.display.ForecastDisplay;
import module.observer.display.HeatIndexDisplay;
import module.observer.display.StatisticsDisplay;

/**
 * Created by Povilas on 2015.07.08.
 */
public class WeatherStationHeatIndex {

    /*
        Observer - defines a one-to-many dependency between
        objects so that when one object changes state, all its
        dependents are notified and updated automatically.
     */

    public WeatherStationHeatIndex() {
    }

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80.0F, 65.0F, 30.4F);
        weatherData.setMeasurements(82.0F, 70.0F, 29.2F);
        weatherData.setMeasurements(78.0F, 90.0F, 29.2F);
    }
}
