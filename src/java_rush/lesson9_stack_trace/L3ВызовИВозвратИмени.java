package java_rush.lesson9_stack_trace;
//Написать пять методов, которые вызывают друг друга.
//Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
//
//Требования:
//•	В классе должно быть 5 методов (метод main не учитывать).
//•	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//•	Каждый метод должен возвращать имя метода, вызвавшего его.
//•	Для получения имени вызвавшего метода, используй метод getMethodName.
public class L3ВызовИВозвратИмени {
    public static void main(String[] args) {

        System.out.println(method1());
    }

    public static String method1() {

        System.out.println( method2());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {

        System.out.println( method3());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {

        System.out.println( method4());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {

        System.out.println( method5());
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        System.out.println("5");
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
