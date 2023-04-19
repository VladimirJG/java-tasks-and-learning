package JavaR3.operator.task2;
//Реализовать логику метода isModifierSet, который проверяет,
// содержит ли переданный параметр allModifiers значение конкретного модификатора specificModifier.
//
//P.S. Перед выполнением задания ознакомься с классом Modifier и реализацией методов isPublic, isStatic и т.п.
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
public class Task2 {
    public static void main(String[] args) {
        int classModifiers = Task2.class.getModifiers();
        System.out.println(isModifierSet(classModifiers, Modifier.PUBLIC));   //true
        System.out.println(isModifierSet(classModifiers, Modifier.STATIC));   //false

        int methodModifiers = getMainMethod().getModifiers();
        System.out.println(isModifierSet(methodModifiers, Modifier.STATIC));      //true
    }

    public static boolean isModifierSet(int allModifiers, int specificModifier) {
        return false;
    }

    private static Method getMainMethod() {
        Method[] methods = Task2.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}
