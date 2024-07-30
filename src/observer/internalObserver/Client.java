package observer.internalObserver;

public class Client {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();
        
        api.addObserver(new KoreanUser("홍길동"));
        api.addObserver(new KoreanUser("임꺽정"));
        api.addObserver(new KoreanUser("세종대왕"));

        api.measureCurrentWeather();

        api.measureCurrentWeather();

        api.measureCurrentWeather();
    }
}
