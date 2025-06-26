package Strategy;

public class CelsiusConverter implements ConversionStrategy{

    private TemperatureUnit targetUnit;

    public CelsiusConverter(TemperatureUnit targetUnit) {
        this.targetUnit = targetUnit;
    }

    @Override
    public double convert(double temperature) {
        switch (targetUnit) {
            case FAHRENHEIT:
                return (temperature * 9/5) + 32;
            case KELVIN:
                return temperature + 273.15;
            case CELSIUS:
                return temperature;
            default:
                throw new IllegalArgumentException("Invalid target unit.");
        }
    }
}
