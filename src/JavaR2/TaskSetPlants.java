package JavaR2;

import java.util.HashSet;
import java.util.Set;

//Создать коллекцию Set (реализация HashSet) с типом элементов String.
//Добавить в неё следующие строки:
//арбуз
//банан
//вишня
//груша
//дыня
//ежевика
//женьшень
//земляника
//ирис
//картофель
//
//Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//Посмотреть, как изменился порядок добавленных элементов.
public class TaskSetPlants {
    public static void main(String[] args) {
        Set<String> plants = new HashSet<>();
        plants.add("арбуз");
        plants.add("банан");
        plants.add("вишня");
        plants.add("груша");
        plants.add("дыня");
        plants.add("ежевика");
        plants.add("женьшень");
        plants.add("земляника");
        plants.add("ирис");
        plants.add("картофель");

        for (String plant : plants) {
            System.out.println(plant);
        }
    }
}
