package java_rush.array;

import java.util.Scanner;

public class Lesson5StringArrayDeleteDouble {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String doubleString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (doubleString == null) {
                    break;
                } else if (doubleString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
