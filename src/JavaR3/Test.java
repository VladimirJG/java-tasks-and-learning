package JavaR3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);
        print(mask);
    }
    public static byte[] getNetAddress(byte[] ip, byte[] mask) {


        return new byte[4];
    }

    public static void print(byte[] bytes) {
        int intByte = 0;
        String[] string = new String[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            intByte = bytes[i] & 0xFF;
            String str = "";
            int[] biTable = {128, 64, 32, 16, 8, 4, 2, 1};
            for (int i1 = 0; i1 < biTable.length; i1++) {
                int endNum = intByte - biTable[i1];
                if (endNum >= 0) {
                    str += "1";
                    intByte = endNum;
                } else {
                    str += "0";
                }
            }
            string[i] = str;
        }
        System.out.println("//" + string[0] + " " + string[1] + " " + string[2] + " " + string[3]);
    }
}
