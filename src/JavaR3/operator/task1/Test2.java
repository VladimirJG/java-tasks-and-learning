package JavaR3.operator.task1;

public class Test2 {
    public static void main(String[] args) {
        byte m = 1;
        String n = Integer.toBinaryString(m & 0xFF);
        String str = "";
        if (n.length() < 8) {
            int x = 8 - n.length();
            int i = 0;
            while (i != x){
                str += "0";
                i++;
            }
            str+=n;
        }
        System.out.println(str);
    }
}
