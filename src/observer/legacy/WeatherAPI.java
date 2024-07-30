package observer.legacy;

import java.util.Random;

public class WeatherAPI {
    float temp;
    float humidity;
    float pressure;

    void measureCurrentWeather(){
        temp = new Random().nextFloat() * 100;
        humidity = new Random().nextFloat() * 100;
        pressure = new Random().nextFloat() * 100;
    }
}
