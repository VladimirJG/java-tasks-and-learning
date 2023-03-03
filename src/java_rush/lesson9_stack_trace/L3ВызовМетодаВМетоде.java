package java_rush.lesson9_stack_trace;
//Написать пять методов, которые вызывают друг друга.
//Каждый метод должен возвращать свой StackTrace.
//
//Требования:
//•	В классе должно быть 5 методов (метод main не учитывать).
//•	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//•	Каждый метод должен возвращать свой StackTrace.
//•	Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().
public class L3ВызовМетодаВМетоде {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace();
    }
}
