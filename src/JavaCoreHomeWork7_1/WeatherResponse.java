package JavaCoreHomeWork7_1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
class DailyForecastWrapper {

    @JsonProperty("Date")
    private String date;

    @JsonProperty("Temperature")
    private Temperature temperature;

    @JsonProperty("Date")
    public String getDate() {
        return date;
    }

    @JsonProperty("Date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("Temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("Temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        String result = date + " " + "температура: " + temperature;
        return result;
    }
};

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherResponse {
    @JsonProperty("DailyForecasts")
    private List<DailyForecastWrapper> dailyForecasts;

    @JsonProperty("DailyForecasts")
    public List<DailyForecastWrapper> getDailyForecasts() {
        return dailyForecasts;
    }

    @JsonProperty("DailyForecasts")
    public void setDailyForecasts(List<DailyForecastWrapper> list) {
        this.dailyForecasts = list;
    }

    @Override
    public String toString() {
        String result = "Прогноз погоды на 5 дней:\n";
        for (DailyForecastWrapper dayForecast : dailyForecasts) {
            result += dayForecast + "\n";
        }
        return result;
    }
}