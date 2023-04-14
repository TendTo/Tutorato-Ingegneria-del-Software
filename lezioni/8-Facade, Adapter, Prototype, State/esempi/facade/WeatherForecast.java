public class WeatherForecast {
    private float latitude;
    private float longitude;

    private void cityToCoordinates(String city) {
        switch (city.toLowerCase()) {
            case "catania" -> {
                this.latitude = 37.5f;
                this.longitude = 15.1f;
            }
            case "palermo" -> {
                this.latitude = 38.1f;
                this.longitude = 13.4f;
            }
            case "messina" -> {
                this.latitude = 38.2f;
                this.longitude = 15.6f;
            }
            case "trapani" -> {
                this.latitude = 38.0f;
                this.longitude = 12.5f;
            }
            case "milano" -> {
                this.latitude = 45.5f;
                this.longitude = 9.2f;
            }
            case "roma" -> {
                this.latitude = 41.9f;
                this.longitude = 12.5f;
            }
            default -> throw new RuntimeException("City not found: " + city);
        }
    }

    public WeatherForecast(String city) {
        cityToCoordinates(city);
    }

    public WeatherForecast(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void printForecast() {
        WeatherApi weatherApi = new WeatherApi(this.latitude, this.longitude);
        WeatherApiParser weatherApiParser = new WeatherApiParser(weatherApi);
        for (DailyWeather dailyWeather : weatherApiParser.getForecast()) {
            System.out.println(dailyWeather);
        }
    }
}
