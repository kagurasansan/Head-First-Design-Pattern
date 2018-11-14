package observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement {

    private Observable data;
    private int z;
    private int y;
    public StatisticsDisplay(Observable weatherdata) {
        data = weatherdata;
        weatherdata.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("当前z" + z + "当前y" + y );
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.z = weatherData.getmZ();
            this.y = weatherData.getmY();
            display();
        }
    }



}
