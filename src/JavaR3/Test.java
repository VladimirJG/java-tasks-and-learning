package JavaR3;

public class Test {
    public static void main(String[] args) {
        int num = 150;
        String str = "";
        int[] biTable = {128, 64, 32, 16, 8, 4, 2, 1};
        for (int i = 0; i < biTable.length; i++) {
            int endNum = num - biTable[i];
            if (endNum >= 0) {
                str += "1";
                num = endNum;
            } else {
                str += "0";
            }
        }
        System.out.println(str);
    }
}
