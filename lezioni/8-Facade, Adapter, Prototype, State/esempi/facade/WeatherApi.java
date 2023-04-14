import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WeatherApi {
    protected static final String BASE_URL = "https://api.open-meteo.com/v1/forecast";
    protected float latitude;
    protected float longitude;

    public WeatherApi(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private String buildUrl() {
        return new StringBuilder()
                .append("https://api.open-meteo.com/v1/forecast?")
                .append("latitude=").append(this.latitude)
                .append("&longitude=").append(this.longitude)
                .append("&daily=weathercode")
                .append("&timezone=Europe/Rome")
                .toString();
    }

    public String getForecastJson() {
        URL url = null;
        try {
            url = new URL(buildUrl());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        try {
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            if (con.getResponseCode() == 200) {
                String inline = "";
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                scanner.close();
                return inline;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new RuntimeException("Error while retrieving forecast");
    }
}
