package java_rush.lesson9_stack_trace;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

//Есть метод, который выбрасывает два исключения, унаследованные от Exception,
// и два унаследованных от RuntimeException:
//NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
//
//Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
//ArithmeticException и URISyntaxException.
//Как это сделать?
//
//Требования:
//•	Метод main должен вызывать метод method1.
//•	Метод main должен перехватывать исключение NullPointerException.
//•	Метод main должен перехватывать исключение FileNotFoundException.
//•	Метод main не должен перехватывать исключение ArithmeticException.
//•	Метод main не должен перехватывать исключение URISyntaxException.
//•	Метод method1 не изменять.
public class L8TCMany {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {
            method1();
        } catch (NullPointerException | FileNotFoundException e){
            e.printStackTrace();
        }


        //напишите тут ваш код
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
