public class Facade {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast("catania");
        weatherForecast.printForecast();
    }
}
