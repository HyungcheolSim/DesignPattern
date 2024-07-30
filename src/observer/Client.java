package observer;

public class Client {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();
        
        api.registerObserver(new KoreanUser("홍길동"));
        api.registerObserver(new KoreanUser("임꺽정"));
        api.registerObserver(new KoreanUser("세종대왕"));

        api.measureCurrentWeather();

        api.measureCurrentWeather();

        api.measureCurrentWeather();

    }
}
