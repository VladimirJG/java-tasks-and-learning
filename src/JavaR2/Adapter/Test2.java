package JavaR2.Adapter;

public class Test2 {
    public static void main(String[] args) {
        String n = "+38(050)123-45-67";
        String m = "callto://+" + n.replaceAll("\\D", "");
        System.out.println(m);
    }
}
