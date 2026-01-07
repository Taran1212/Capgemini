import java.util.Scanner;

public class q6 {
    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKg(double p) {
        return p * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double g) {
        return g * 3.78541;
    }

    public static double convertLitersToGallons(double l) {
        return l * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        double p = sc.nextDouble();
        double kg = sc.nextDouble();
        double g = sc.nextDouble();
        double l = sc.nextDouble();

        System.out.println(convertFahrenheitToCelsius(f));
        System.out.println(convertCelsiusToFahrenheit(c));
        System.out.println(convertPoundsToKg(p));
        System.out.println(convertKgToPounds(kg));
        System.out.println(convertGallonsToLiters(g));
        System.out.println(convertLitersToGallons(l));
    }
}
