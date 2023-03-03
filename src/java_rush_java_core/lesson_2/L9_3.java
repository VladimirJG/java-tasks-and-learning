package java_rush_java_core.lesson_2;

//Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
//Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).
//
//Требования:
//•	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
//•	Класс Solution должен содержать интерфейс CanMove с одним методом move().
//•	Класс Solution должен содержать интерфейс CanEat с одним методом eat().
//•	Собака должна уметь передвигаться и есть.
//•	Автомобиль должен уметь передвигаться.
//•	Самолет должен уметь передвигаться и летать.
//•	Утка должна уметь передвигаться, летать и есть.
public class L9_3 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move(){

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements CanMove, CanFly, CanEat{
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

    public class Car implements CanMove{
        @Override
        public void move() {

        }
    }

    public class Airplane implements CanMove,CanFly{
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }
}
