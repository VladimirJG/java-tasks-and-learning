package java_rush.lesson4;

/*Допишите код метода setName, чтобы с его помощью установить значение
private String fullName равное значению локальной переменной String fullName.*/
public class L2FullName {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String full = firstName + " " + lastName;

        //напишите тут ваш код
        this.fullName = full;
        //вариант 2//this.fullName = firstName + " " + lastName
    }

    public static void main(String[] args) {
        /*L2FullName name = new L2FullName();
        name.setName("Vl", "D");
        System.out.println(name.fullName);*/
    }
}
