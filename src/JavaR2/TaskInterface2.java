package JavaR2;

//Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
//Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).
public class TaskInterface2 {
    public static void main(String[] args) {

    }

    public interface CanFly {
         void fly();
    }

    public interface CanMove {
        void move();
    }

    public interface CanEat {
         void eat();
    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements CanFly, CanEat, CanMove {
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {

        }

        @Override
        public void fly() {

        }
    }
}
