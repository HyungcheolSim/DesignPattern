package observer.legacy;

public class KoreanUser implements IUser{
    WeatherAPI api;
    String name;

    public KoreanUser(WeatherAPI api, String name) {
        this.api = api;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.printf("%s님이 현재 날씨 상태를 조회함 : %.2f°C %.2fg/m3 %.2fhPa\n", name, api.temp, api.humidity, api.pressure);
    }
}
