package JavaCoreHomeWork7_1;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Temperature {
    @JsonProperty(value = "Minimum")
    private TemperatureUnit minimum;
    @JsonProperty(value = "Maximum")
    private TemperatureUnit maximum;

    @JsonGetter("Minimum")
    public TemperatureUnit getMinimum() {
        return minimum;
    }

    @JsonSetter("Minimum")
    public void setMinimum(TemperatureUnit minimum) {
        this.minimum = minimum;
    }

    @JsonGetter("Maximum")
    public TemperatureUnit getMaximum() {
        return maximum;
    }

    @JsonSetter("Maximum")
    public void setMaximum(TemperatureUnit maximum) {
        this.maximum = maximum;
    }

    @Override
    public String toString() {
        String result = "мин: " + minimum + "," + " макс: " + maximum;
        return result;
    }
}