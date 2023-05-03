public class CalcularTemperatura {
    public double fahrenheitACelcius(double f) {
        return (f - 32.0) * 0.555;
    }

    public double celciusAFahrenheit(double c) {
        return c * 1.8 + 32.0;
    }
}