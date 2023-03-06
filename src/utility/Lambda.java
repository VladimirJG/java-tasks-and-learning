package utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lambda {
    public static void main(String[] args) throws Exception {
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            Collections.addAll(list, reader.readLine());
            i++;
        }
        list.stream().filter(s -> s.contains("д")).forEach(s -> System.out.println(s + " - " + s.length()));
        list.stream().takeWhile(s -> s.length() <= 5).forEach(s -> System.out.println(s + " - " + s.length()));
        list.stream().dropWhile(s -> s.length() <= 5).forEach(s -> System.out.println(s + " - " + s.length()));
        */

        int [] list1 = {5, 6, 15, 25, 8};

        int odd = (int) IntStream.of(list1).filter(o -> (o % 2 != 0)).count();
        System.out.println(odd);
    }
}
