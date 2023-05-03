package tin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewTask3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfSymbol = Integer.parseInt(reader.readLine());
        String stringOfSymbol = reader.readLine();

        System.out.println(countOfGoodString(countOfSymbol, stringOfSymbol));
    }

    public static int countOfGoodString(int n, String s) {
        if (n != s.length()) {
            return -1;
        }
        int count = 0;
        int index = 97;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((int) s.charAt(i)< index){
                break;
            }
            if ((int) s.charAt(i) == 100 && (int) s.charAt(i + 1) == 100) {
                if ((int) s.charAt(i - 1) == 100) {
                    break;
                } else {
                    count++;
                }
            } else if ((int) s.charAt(i) == index && (int) s.charAt(i + 1) == index + 1) {
                count++;
                index++;
            } else if (index > 97 && (int) s.charAt(i + 1) == index) {
                count++;
            }
        }
        return count;
    }
}
