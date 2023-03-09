package sinergy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.Arrays.spliterator;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list, "Lашаnaa Машев", "Jora Bora", "Input Strimov", "Lран Упашев",
                "Baran Wupashev", "Alen Wakashev", "Hurry Woo", "Dany Weweto", "Weweto Strimov");
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
        /*int n = (int) list.stream().map(s -> s.split(" ")[0]).filter(s -> (s.length()>6)).count();
        System.out.println(n);*/

        //6 Метод должен вернуть суммарное количество уникальных имён и фамилий, длиннее 5 символов

        //     * P. S. Самостоятельно почитайте про метод flatMap()

       /* int n = (int) list.stream().map(s -> s.split(" ")[0]).filter(s -> (s.length() > 5)).distinct().count();
        int m = (int) list.stream().map(s -> s.split(" ")[1]).filter(s -> (s.length() > 5)).distinct().count();
        System.out.println(n + m);*/

        /*int e = (int) Stream.of(List.of(list.stream().map(s -> s.split(" ")[0]).filter(s -> (s.length() > 5))),
                        List.of(list.stream().map(s -> s.split(" ")[1]).filter(s -> (s.length() > 5))))
                .flatMap(Collection::stream).count();
        System.out.println(e);*/

        /*list.stream().map(s -> s.split(" ")).toList().stream().flatMap(x-> Arrays.stream(x).map(y->y.split(" ")))
                .distinct().toList().forEach(y-> System.out.println(Arrays.toString(y)));*/

        /*String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
        streamOfArray.map(s -> s.split("")) //Преобразование слова в массив букв
                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный поток в один поток
                .collect(Collectors.toList()).forEach(System.out::print);
*/
//finished
   /*    int n = (int) Stream.concat(list.stream().map(s -> s.split(" ")[0]),list.stream().map(s -> s.split(" ")[1]))
               .filter(s -> (s.length()>5)).distinct().count();
        System.out.println(n);
*/
        // 7  Метод должен вернуть имена людей, чья фамилия начинается с K или S, в формате имя + первая буква фамилии,
        //     * например "David Z.". Список должен быть отсортирован по алфавиту и состоять только из уникальных значений
/*
        for (int i = 0; i < list.size(); i++) {
            String[] m = (list.get(i).split(" "));
            for (int i1 = 0; i1 < m.length; i1++) {
                list2.add(m[i1]);
            }
        }
        System.out.println(list2);*/
//+++++++++++++++++++++++++++++
        //работа flatMap
       /* list.stream().map(s -> s.split(" ")).flatMap(strings -> Arrays.stream(strings)).distinct()
                .forEach(list2::add);
        System.out.println(list2);*/
//+++++++++++++++++++++++++++++

       /* Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());*/

        /*list.stream().map(s -> s.split(" ")).flatMap(strings -> Arrays.stream(strings).skip(1))
                .forEach(list2::add);
        System.out.println(list2);*/

        list.stream().map(s -> s.split(" ")).takeWhile(strings -> Arrays.stream(strings).filter(s -> s.contains("W")).isParallel())
                .forEach(System.out::println);
    }
}
