package adapter.temperature;

import org.junit.jupiter.api.Test;

class TemperatureTests {

    @Test
    void temperature_test() {
        FahrenheitTemperature fahrenheitTemperature = new FahrenheitTemperature();
        fahrenheitTemperature.setFahrenheit(100);

        CelsiusTemperature temperatureAdapter = new TemperatureAdapter(fahrenheitTemperature);
        System.out.println("섭씨 온도: " + temperatureAdapter.getCelsius());

        temperatureAdapter.setCelsius(25);
        System.out.println("화씨 온도: " + fahrenheitTemperature.getFahrenheit());
    }

}
