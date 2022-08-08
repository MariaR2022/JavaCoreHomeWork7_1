package JavaCoreHomeWork7_1;

import JavaCoreHomeWork7_1.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException;

}