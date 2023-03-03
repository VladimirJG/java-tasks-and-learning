package java_rush.lesson2;

public class L2L3Converter {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //TF = (9 / 5) * TC + 32
        double fahrenheit = 9 / 5.0 * celsius + 32;

        return fahrenheit;
    }
}
