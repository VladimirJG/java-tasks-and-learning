package java_rush.lesson7ArrayList;

public class Commands {
    //ArrayList
   /* ArrayList<String> list = new ArrayList<String>();
    int n = list.size();
    String s = list.get(3); //Взятие элемента из массива/коллекции
    list.set(3, s);*/ //Запись элемента в массив
   /* list.add(s);
list.add(15, s);
list.add(0, s);
list.remove(3);*/

    // ввод строк с клавиатуры
    /*ArrayList<String> list = new ArrayList<String>();
for (int i = 0; i < 10; i++)
    {
        String s = reader.readLine();
        list.add(s);
    }*/

// вывод содержимого коллекции
// на экран в обратном порядке
/*for (int i = 0; i < list.size(); i++)
    {
        int j = list.size() - i - 1;
        System.out.println( list.get(j) );*/
//2вариант
   /* for (int i = list.size() - 1; i >= 0; i--) {
        String string = list.get(i);
        System.out.println(string);*/

    //Ввод списка целых чисел с клавиатуры
    /*while (true)
    {
        String s = reader.readLine();
        if (s.isEmpty()) break;
        list.add(Integer.parseInt(s));
    }*/

    //То же, чётные числа добавляются в конец списка, нечётные — в начало
     /*while (true)
    {
        String s = reader.readLine();
        if (s.isEmpty()) break;

        int x = Integer.parseInt(s);
        if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
            list.add(x);          //добавление в конец
        else
            list.add(0, x);      //вставка в начало
    }*/

    //убрали увеличение i внутрь цикла
    /*for (int i = 0; i < list.size(); ) //убрали увеличение i внутрь цикла
    {
        if (list.get(i) > 5)
            list.remove(i);  //не увеличиваем i, если удалили текущий  элемент
        else
            i++;
    }*/

    //Разделение массива на два — чётных и нечётных чисел
    //статическая инициализация массива
    /*int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

    //создание списка, где все элементы должны быть типа Integer
    ArrayList<Integer> list = new ArrayList<Integer> ();

    //заполнение списка из массива
    for (int i = 0; i < data.length; i++) list.add(data[i]);

    ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
    ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

    for (int i = 0; i < list.size(); i++)
    {
        Integer x = list.get(i);
        if (x % 2 == 0)    //если x - чётное
            even.add(x);   // добавляем x в коллекцию четных чисел
        else
            odd.add(x);    // добавляем x в коллекцию нечетных чисел
    }*/

    //Слияние списков.
    /*ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка
    Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

    ArrayList<Integer> list2 = new ArrayList<Integer>();
    Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

    ArrayList<Integer> result = new ArrayList<Integer>();

    result.addAll(list1);   //добавление всех значений из одного списка в другой
    result.addAll(list2);

    for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
    {
        System.out.println(x);
    }*/

    /*Cat thomas = new Cat("Томас");
    Cat behemoth = new Cat("Бегемот");
    Cat philipp = new Cat("Филипп Маркович");
    Cat pushok = new Cat("Пушок");

    Cat[] catsArray = {thomas, behemoth, philipp, pushok};

    ArrayList<Cat> catsList = new ArrayList<>(Arrays.asList(catsArray));
   System.out.println(catsList);
}*/

   /* ArrayList<Cat> cats = new ArrayList<>();

    Cat thomas = new Cat("Томас");
    Cat behemoth = new Cat("Бегемот");
    Cat philipp = new Cat("Филипп Маркович");
    Cat pushok = new Cat("Пушок");

   cats.add(thomas);
   cats.add(behemoth);
   cats.add(philipp);
   cats.add(pushok);

    Cat[] catsArray = cats.toArray(new Cat[0]);

   System.out.println(Arrays.toString(catsArray));*/
}
