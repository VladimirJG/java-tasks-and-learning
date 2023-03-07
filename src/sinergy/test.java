package sinergy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list, "Lашаnaa Машев", "Jora Bora", "Input Strimov", "Lран Упашев",
                "Baran Wupashev", "Alen Wakashev", "Hurry Woo", "Dany Weweto");
        System.out.println(list);
       /* for (int i = 0; i < list.size(); i++) {
            String[] m = list.get(i).split(" ");
            char[] str = m[0].toCharArray();
            if (str[0] == 'L'){
                list2.add(String.valueOf(str));
            }
        }
        System.out.println(list2);*/
//3
        //list.stream().map(s->s.split(" ")[0]).toList().stream().map(x->x.split("")[0].equals("L"));
        /*list.stream().map(s->s.split(" ")[0]).toList().stream().dropWhile(x -> x.equals("L"))
                .forEach(list2::add);
        list2.stream().filter(s -> s.contains("L")).forEach(list3::add);
        System.out.println(list3);*/

// 3 - finish
        /*list.stream().map(s -> s.split(" ")[0]).filter(s -> s.contains("L")).forEach(list2::add);
        System.out.println(list2);*/

//1
        //list.forEach(s -> System.out.println(Arrays.toString(new String[]{s.split(" ")[1]})));
        // list.forEach(s-> list2.add(Arrays.toString(new String[]{s.split(" ")[1]})));

  //2
       /* list.stream().map(s -> s.split(" ")[1]).collect(Collectors.toList()).forEach(list2::add);
        System.out.println(list2);*/

        //4 Метод должен вернуть список уникальных фамилий, начинающихся с W, отсортированный по алфавиту
// сортировка по имени
        /*list.stream().sorted().map(s -> s.split(" ")[1]).filter(s -> s.contains("W")).forEach(list2::add);
        System.out.println(list2);*/

        // сортировка по второй букве фамилии
        /*list.stream().map(s -> s.split(" ")[1]).filter(s -> s.contains("W")).sorted().forEach(list2::add);
        System.out.println(list2);*/

//5 Метод должен вернуть количество имен длинее чем 6 символов
        int n = (int) list.stream().map(s -> s.split(" ")[0]).filter(s -> (s.length()>6)).count();
        System.out.println(n);

    }
}
