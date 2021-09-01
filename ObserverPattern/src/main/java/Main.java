import notification.InternetNews;
import notification.RadioNews;
import notification.TVNews;
import weather.Weather;

public class Main {
    public static void main(String[] args) {
        Weather weatherForecast=new Weather(24,1001);
        InternetNews internetNews= new InternetNews();
        RadioNews radioNews=new RadioNews();
        TVNews tvNews=new TVNews();
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);
        //change of weather
        weatherForecast.changeForecast(22,996);
        weatherForecast.changeForecast(23,999);
    }
}