package dmdev.oop.exception;

/**
 * Создать код, который создаст, а затем отловит ArrayIndexOutOfBoundException.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] newArray = new int[0];

        try {
            System.out.println(newArray[2]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println("Поймал");
            exception.printStackTrace();
        }
    }
}
