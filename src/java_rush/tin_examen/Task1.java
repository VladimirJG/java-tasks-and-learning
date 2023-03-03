package java_rush.tin_examen;


import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        String string = "1234??7890";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(String.valueOf(string.charAt(i)));
        }
        if (list.get(0).equals("1") && list.get(list.size() - 1).equals("0")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


