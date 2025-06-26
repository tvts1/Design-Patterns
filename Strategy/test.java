package Strategy;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");

        System.out.print("Enter source unit (CELSIUS, FAHRENHEIT, KELVIN): ");
        TemperatureUnit sourceUnit = TemperatureUnit.valueOf(scanner.nextLine().trim().toUpperCase());

        System.out.print("Enter target unit (CELSIUS, FAHRENHEIT, KELVIN): ");
        TemperatureUnit targetUnit = TemperatureUnit.valueOf(scanner.nextLine().trim().toUpperCase());

        System.out.print("Enter temperature value: ");
        double inputTemperature = scanner.nextDouble();

        ConversionStrategy strategy;

        switch (sourceUnit) {
            case CELSIUS:
                strategy = new CelsiusConverter(targetUnit);
                break;
            case FAHRENHEIT:
                strategy = new FahrenheitConverter(targetUnit);
                break;
            case KELVIN:
                strategy = new KelvinConverter(targetUnit);
                break;
            default:
                throw new IllegalArgumentException("Invalid source unit.");
        }

        TemperatureConverter converter = new TemperatureConverter(strategy);
        double result = converter.convert(inputTemperature);

        System.out.printf("Result: %.2f %s%n", result, targetUnit);

        scanner.close();
    }
}