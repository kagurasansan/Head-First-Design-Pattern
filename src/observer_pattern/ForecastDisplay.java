package observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement {

    private Observable data;
    private int x;
    private int z;
    public ForecastDisplay(Observable weatherdata) {
        data = weatherdata;
        weatherdata.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("force当前x" + x + "当前y" + z );
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.x = weatherData.getmX();
            this.z = weatherData.getmZ();
            display();
        }
    }

}
