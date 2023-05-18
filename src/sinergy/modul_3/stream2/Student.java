package sinergy.modul_3.stream2;

import java.util.Optional;

/**
 * 1)    Реализуйте класс Student, полями которого являются:
 * private String name;
 * private Optional<Address> address;
 * <p>
 * Пропишите два конструктора (первый от имени и адреса, второй только от имени) и геттеры для полей.
 * Реализуйте класс Address, полями которого являются:
 * private String city;
 * <p>
 * private String region;
 * <p>
 * Пропишите конструктор и геттеры.
 * В классе Main создайте метод printStudentInfo(Student student),
 * который выводит информацию о студенте. Если адрес студента не указан,
 * то должно выводиться только имя. Создайте несколько студентов,
 * используя оба конструктора, и протестируйте этот метод.
 * <p>
 * 2)     Создайте список произвольных слов. С помощью StreamAPI и метода reduce объедините слова
 * в предложение. Выведите первоначальный список и полученное предложение в консоль.
 */
public class Student  {
    private String name;
    private Optional<Address> address;

    public Student(String name, Optional<Address> address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<Address> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
