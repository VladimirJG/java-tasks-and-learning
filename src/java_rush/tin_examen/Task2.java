package java_rush.tin_examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        int res = 0;
        for (int i = 0; i < n - 2; i++) {
                res += list.get(i + 1) + list.get(i);
        }
        if (res < 0 ){
            System.out.println(list.get(list.size()-1));
        }else {
            System.out.println("inf");
        }
        // 2 часа убил на понимание логики)) бесполезно, если это кто прочитает,
        // очень хотелось бы получить разъяснение vladimi85@gmail.com
        //#яумамыдурачек))
    }
}


