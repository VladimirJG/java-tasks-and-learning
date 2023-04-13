package cs50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task4FirstNamesLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String lastName = reader.readLine();
        String firstName = reader.readLine();

        firstLetter(lastName);
        firstLetter(firstName);
    }

    public static String firstLetter(String str) {
        String letter = String.valueOf(str.charAt(0));
        System.out.println(letter.toUpperCase());
        return letter.toUpperCase();
    }
}
