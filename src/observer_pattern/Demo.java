package observer_pattern;

public class Demo {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setData(5,3,4);
        weatherData.setData(8,9,2);
        weatherData.setData(2,5,8);
    }
}
