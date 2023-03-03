package java_rush.lesson4;
/*Подумайте, что делает программа.
        Исправь ошибку в программе чтобы переменная age объекта person изменила свое значение.*/
public class L1ThisAge {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted age is: " + person.age);
    }

    public static class Person {
        public int age = 20;

        public void adjustAge(int age) {
            //добавлено this
            this.age = age + 30;
            System.out.println("Age in adjustAge() is: " + age);
        }
    }
}
