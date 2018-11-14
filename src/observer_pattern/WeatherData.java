package observer_pattern;



import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {

    private List<Observer> observerList;
    private int mX;
    private int mY;
    private int mZ;

    public int getmX() {
        return mX;
    }

    public int getmY() {
        return mY;
    }

    public int getmZ() {
        return mZ;
    }

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    public void measureChange(){
        setChanged();
        notifyObservers();
    }

    public void setData(int x,int y,int z){
        mX = x;
        mY = y;
        mZ = z;
        measureChange();
    }
}
