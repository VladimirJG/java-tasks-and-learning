package tin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String singleLine = reader.readLine();
        for (int i = 1; i < singleLine.length() - 1; i++) {
            int symbol = Integer.parseInt(String.valueOf(singleLine.charAt(i)));
            int minOneSymbol = Integer.parseInt(String.valueOf(singleLine.charAt(i - 1)));
            int plusOneSymbol = Integer.parseInt(String.valueOf(singleLine.charAt(i + 1)));
            if (minOneSymbol > symbol && symbol < plusOneSymbol || minOneSymbol < symbol && symbol > plusOneSymbol) {
                System.out.println("NO");
                break;
            } else {
                if (i + 1 == singleLine.length() - 1) {
                    System.out.println("YES");
                }
            }
        }
    }
}
