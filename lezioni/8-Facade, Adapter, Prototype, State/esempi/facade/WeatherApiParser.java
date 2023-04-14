import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherApiParser {
    private String weatherJson;

    public WeatherApiParser(String weatherJson) {
        this.weatherJson = weatherJson;
    }

    public WeatherApiParser(WeatherApi weatherApi) {
        this.weatherJson = weatherApi.getForecastJson();
    }

    public String getWeatherJson() {
        return weatherJson;
    }

    public List<DailyWeather> getForecast() {
        List<DailyWeather> forecast = new ArrayList<>();
        Pattern timePattern = Pattern.compile("\"daily\".*?\"time\".*?\\[(.+?)\\]", Pattern.CASE_INSENSITIVE);
        Matcher timeMatcher = timePattern.matcher(weatherJson);
        timeMatcher.find();
        String[] days = timeMatcher.group(1).split(" *, *");
        Pattern weatherCodePattern = Pattern.compile("\"daily\".*?\"weathercode\".*?\\[(.+?)\\]",
                Pattern.CASE_INSENSITIVE);
        Matcher weatherCodeMatcher = weatherCodePattern.matcher(weatherJson);
        weatherCodeMatcher.find();
        String[] weatherCodes = weatherCodeMatcher.group(1).split(" *, *");

        for (int i = 0; i < days.length; i++) {
            String time = days[i].substring(1, days[i].length() - 1);
            int weatherCode = Integer.parseInt(weatherCodes[i]);
            forecast.add(new DailyWeather(time, weatherCode));
        }
        return forecast;
    }
}
