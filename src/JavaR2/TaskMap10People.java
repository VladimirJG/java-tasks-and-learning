package JavaR2;
//Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
//Проверить сколько людей имеют совпадающие с заданным именем или фамилией.

import java.util.HashMap;
import java.util.Map;

public class TaskMap10People {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> dataBase = new HashMap<>();
        dataBase.put("Пупкин", "Вася");
        dataBase.put("Зайкин", "Женя");
        dataBase.put("Пупкин", "Сергей");
        dataBase.put("Катин", "Вася");
        dataBase.put("Шолув", "Семен");
        dataBase.put("Крогов", "Дима");
        dataBase.put("Запалкин", "Женя");
        dataBase.put("Чадов", "Вася");
        dataBase.put("Кпупов", "Олег");
        dataBase.put("Зайкин", "Миша");
        return dataBase;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int count = 1;
        for (String firstname :
                map.values()) {
            if (firstname.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 1;
        for (String lastNameMap :
                map.keySet()) {
            if (lastName.equals(lastNameMap)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> newDataBase = createMap();
        System.out.println(getCountTheSameFirstName(newDataBase, "Вася"));
        System.out.println(getCountTheSameLastName(newDataBase,"Пупкин"));
        System.out.println(newDataBase);
    }
}
