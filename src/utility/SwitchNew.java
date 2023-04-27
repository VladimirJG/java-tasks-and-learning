package utility;

public class SwitchNew {
    public static void main(String[] args) {

        var month = 9;

        String res = switch (month) {
            case 9, 10, 11 -> "Numbers";
            case 15-> "Return";
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
    }
}
