package sobes;

public class StrToIntStr {
    public static void main(String[] args) {
        String str = "ACCBBBBVVCCCC";
        //AC2B4V2C4
        System.out.println(returnStringCount(str));
//        System.out.println(str.charAt(1));
    }

    private static String returnStringCount(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                stringBuilder.append(str.charAt(i));
                if (count > 1) {
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }
        return stringBuilder.toString();
    }
}
