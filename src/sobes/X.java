package sobes;

public class X {
    public static void main(String[] args) {
       /* Integer a = 120;
        Integer b = 120;
        Integer c = 130;
        Integer d = 130;
        System.out.println(a == b);
        System.out.println(c == d);*/
        Integer a = 120;
        Integer b = a;
        Integer c = 130;
        Integer d = c;
        System.out.println(a == b);
        System.out.println(c == d);

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);
    }
}
