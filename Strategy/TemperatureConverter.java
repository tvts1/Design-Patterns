package Strategy;

public class TemperatureConverter {
    private ConversionStrategy strategy;

    public TemperatureConverter(ConversionStrategy strategy) {
        this.strategy = strategy;
    }

    public double convert(double temperature) {
        return strategy.convert(temperature);
    }
}
