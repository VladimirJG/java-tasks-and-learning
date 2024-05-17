package sobes;

public class InterpretatorMath {
    public static void main(String[] args) {
        String expressionText = "22 + 3 - 2 * (2 * 5 + 2) * 4";

        String[] s = expressionText.split(" ");
        System.out.println(s[1].charAt(0));
    }

}
