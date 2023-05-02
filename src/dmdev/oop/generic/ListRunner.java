package dmdev.oop.generic;

public class ListRunner {
    public static void main(String[] args) {
        List<Integer> list = new List<>(10);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(15);
        list.add(10);
        list.add(19);
        list.add(10);

        System.out.println(list.get(3));
    }
}
