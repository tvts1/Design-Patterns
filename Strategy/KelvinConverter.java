package Strategy;

public class KelvinConverter implements ConversionStrategy {
    private TemperatureUnit targetUnit;

    public KelvinConverter(TemperatureUnit targetUnit) {
        this.targetUnit = targetUnit;
    }

    @Override
    public double convert(double temperature) {
        switch (targetUnit) {
            case CELSIUS:
                return temperature - 273.15;
            case FAHRENHEIT:
                return (temperature - 273.15) * 9/5 + 32;
            case KELVIN:
                return temperature;
            default:
                throw new IllegalArgumentException("Invalid target unit.");
        }
    }
}