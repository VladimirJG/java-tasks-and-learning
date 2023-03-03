package java_rush_java_core.lesson_2;

//Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
//Добавить в каждый интерфейс по одному методу.
//
//Требования:
//•	Класс Solution должен содержать интерфейс CanFly.
//•	Класс Solution должен содержать интерфейс CanRun.
//•	Класс Solution должен содержать интерфейс CanSwim.
//•	Интерфейс CanFly должен содержать один метод.
//•	Интерфейс CanRun должен содержать один метод.
//•	Интерфейс CanSwim должен содержать один метод.
public class L9_2 {
    public static void main(String[] args) {

    }

    //add interfaces here - добавь интерфейсы тут
    public interface CanFly {
        void fly();
    }public interface CanRun {
        void run();
    }public interface CanSwim {
        void swim();
    }
}
