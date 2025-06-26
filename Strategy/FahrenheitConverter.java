package Strategy;

public class FahrenheitConverter implements ConversionStrategy {
    private TemperatureUnit targetUnit;

    public FahrenheitConverter(TemperatureUnit targetUnit) {
        this.targetUnit = targetUnit;
    }

    @Override
    public double convert(double temperature) {
        switch (targetUnit) {
            case CELSIUS:
                return (temperature - 32) * 5/9;
            case KELVIN:
                return (temperature - 32) * 5/9 + 273.15;
            case FAHRENHEIT:
                return temperature;
            default:
                throw new IllegalArgumentException("Invalid target unit.");
        }
    }
}

