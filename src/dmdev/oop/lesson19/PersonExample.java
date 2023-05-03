package dmdev.oop.lesson19;

public class PersonExample {
    public static void main(String[] args) {
        Person petr = new Person(1, "Petr", "Petrov");
        Person ivan = new Person(1, "Petr", "Petrov");
        //Person ivan = new Person(2, "Ivan", "Ivanov");


        System.out.println(petr.hashCode());
        System.out.println(ivan.hashCode());
        System.out.println(ivan.equals(petr));
    }
}
