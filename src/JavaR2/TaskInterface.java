package JavaR2;

//Напиши свой public интерфейс CanFly(летать).
//Добавь в него два метода.

//Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
//Добавить в каждый интерфейс по одному методу.
public class TaskInterface {
    public static void main(String[] args) {

    }

    //add an interface here - добавь интерфейс тут
    public interface CanFly {
        void transportPeople();

        void carryCargo();
    }
    public interface CanRun{
        boolean run();
    }
    public interface CanSwim{
        int swim();
    }
}
