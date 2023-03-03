package java_rush.lesson8_collections;
//Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
//Удалить из словаря всех людей, у которых зарплата ниже 500.
//
//Требования:
//•	Программа не должна выводить текст на экран.
//•	Программа не должна считывать значения с клавиатуры.
//•	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String,
// Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
//•	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
import java.util.HashMap;
import java.util.Map;
public class L8УдалениеОдинаковыхЗначенийMap {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Смирнов", 500);
        map.put("Иванов", 300);
        map.put("Кузнецов", 2000);
        map.put("Соколов", 550);
        map.put("Попов", 200);
        map.put("Лебедев", 600);
        map.put("Новиков", 700);
        map.put("Козлов", 850);
        map.put("Морозов", 725);
        map.put("Петров", 530);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
