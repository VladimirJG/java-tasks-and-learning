package java_rush.lesson9_stack_trace;
//Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//int num=Integer.parseInt("XYZ");
//System.out.println(num);
//
//Требования:
//•	Программа должна выводить сообщение на экран.
//•	В программе должен быть блок try-catch.
//•	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//•	Выведенное сообщение должно содержать тип возникшего исключения.
//•	Имеющийся код в методе main не удалять.
public class L6TruC4 {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}
