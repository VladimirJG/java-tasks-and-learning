package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();
            String newStr = str.replaceAll("[0-9],", "");
            System.out.println(newStr);
            if (str.contains("exit")) {
                break;
            }
        }
    }
}
