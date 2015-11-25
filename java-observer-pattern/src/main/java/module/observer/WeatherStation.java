package module.observer;

import module.observer.display.CurrentConditionsDisplay;
import module.observer.display.ForecastDisplay;
import module.observer.display.HeatIndexDisplay;
import module.observer.display.StatisticsDisplay;

/**
 * Created by Povilas on 2015.07.07.
 */
public class WeatherStation {

    /*
        Observer - defines a one-to-many dependency between
        objects so that when one object changes state, all its
        dependents are notified and updated automatically.
     */


    public static void main(String args[]) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
