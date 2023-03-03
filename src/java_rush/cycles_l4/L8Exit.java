package java_rush.cycles_l4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class L8Exit {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line = buffer.readLine();
        boolean isExit = false;
        while (!isExit)
        {
            String s = buffer.readLine();
            isExit = s.equals("exit");
        }
    }
}
