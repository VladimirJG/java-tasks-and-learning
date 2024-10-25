package sobes.aston.task2;

public class ExampleUser {
    public static void main(String[] args) {
        int a = 4;
        Integer b = 9;
        User user = new User(18);
        inc(a);
        inc(b);
        inc(user);
        System.out.println(a);
        System.out.println(b);
        System.out.println(user.age);
    }

    private static void inc(int a) {
        a++;
    }

    private static void inc(Integer a) {
        a++;
    }

    private static void inc(User a) {
        a.age++;
    }
}
