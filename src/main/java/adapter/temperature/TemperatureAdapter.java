package adapter.temperature;

// Adapter
public class TemperatureAdapter implements CelsiusTemperature {

    private FahrenheitTemperature fahrenheitTemperature;

    public TemperatureAdapter(FahrenheitTemperature fahrenheitTemperature) {
        this.fahrenheitTemperature = fahrenheitTemperature;
    }

    @Override
    public double getCelsius() {
        double fahrenheit = fahrenheitTemperature.getFahrenheit();
        return (fahrenheit - 32) * 5 / 9; // 화씨 -> 섭씨
    }

    @Override
    public void setCelsius(double celsius) {
        double fahrenheit = celsius * 9 / 5 + 32; // 섭씨 -> 화씨
        fahrenheitTemperature.setFahrenheit(fahrenheit);
    }
}
