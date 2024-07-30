package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherAPI implements Subject{
    float temp;
    float humidity;
    float pressure;

    List<Observer> subscribers = new ArrayList<>();

    void measureCurrentWeather(){
        temp = new Random().nextFloat();
        humidity = new Random().nextFloat();
        pressure = new Random().nextFloat();

        notifyObservers();
    }


    @Override
    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: subscribers){
            o.display(this);
        }
    }
}
