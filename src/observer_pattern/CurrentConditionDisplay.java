package observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    private Observable data;
    private int x;
    private int y;
    public CurrentConditionDisplay(Observable weatherdata) {
        data = weatherdata;
        weatherdata.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("curr当前x" + x + "当前y" + y );
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.x = weatherData.getmX();
            this.y = weatherData.getmY();
            display();
        }
    }
}
