package other.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Student student = new Student();
        Field[] field = student.getClass().getDeclaredFields();
        for (Field value : field) {
            value.setAccessible(true);
            System.out.println(value.get(student));
        }
    }
}
