package java_rush.lesson9_stack_trace;
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//String s = null;
//String m = s.toLowerCase();
//
//Требования:
//•	Программа должна выводить сообщение на экран.
//•	В программе должен быть блок try-catch.
//•	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//•	Выведенное сообщение должно содержать тип возникшего исключения.
//•	Имеющийся код в методе main не удалять.
public class L6TryC2 {
    public static void main(String[] args) {
        //напишите тут ваш код
try {
    String s = null;
    String m = s.toLowerCase();
}catch (NullPointerException e){
    System.out.println("Сообщение");
    System.out.println(e);
}

        //напишите тут ваш код
    }
}


