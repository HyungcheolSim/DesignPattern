package observer.legacy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        WeatherAPI api = new WeatherAPI();

        List<IUser> users = new ArrayList<>();
        users.add(new KoreanUser(api,"홍길동"));
        users.add(new KoreanUser(api,"임꺽정"));
        users.add(new KoreanUser(api,"세종대왕"));

        api.measureCurrentWeather();
        for(IUser user: users){
            user.display();
        }

        api.measureCurrentWeather();
    }
}
