package java_rush_java_core.lesson_2;

//Реализуй два метода: print(int) и print(Integer).
//Напиши такой код в методе main(), чтобы вызвались оба.
//
//Требования:
//•	Класс Solution должен содержать статический метод main().
//•	Класс Solution должен содержать статический void метод print() с параметром типа int.
//•	Класс Solution должен содержать статический void метод print() с параметром типа Integer.
//•	Метод main() должен вызывать метод print() с параметром типа int.
//•	Метод main() должен вызывать метод print() с параметром типа Integer.
public class L4_2 {
    public static void main(String[] args) {
        print(12);
        print(new Integer(12));
    }

    //Напишите тут ваши методы
    public static void print(int a) {

    }

    public static void print(Integer a) {

    }
}

