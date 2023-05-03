package tin;

import java.util.Scanner;

public class NewTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String singleLine = scanner.nextLine();
        String[] newLine = new String[2];
        newLine = singleLine.split(" ");
        int junior = Integer.parseInt(newLine[0]);
        int senior = Integer.parseInt(newLine[1]);
        int numberOfChecks = Integer.parseInt(newLine[2]);

        System.out.println(sumTimeOfMinutes(junior, senior, numberOfChecks));
    }

    public static int sumTimeOfMinutes(int n, int m, int k) {
        return (n / m) * k + (n % m);
    }
}