package java_rush.Lesson3;

public class L3L1ConvertEurToUsd {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(100, 1.7));
        System.out.println(convertEurToUsd(59,2.3));
        /*Решение JR
        double usd1 = convertEurToUsd(100, 0.8);
        double usd2 = convertEurToUsd(200, 0.8);
        System.out.println(usd1);
        System.out.println(usd2);*/
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
