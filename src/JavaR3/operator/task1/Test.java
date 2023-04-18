package JavaR3.operator.task1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);
        print(mask);
        print(netAddress);
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] newByte = new byte[ip.length];
        for (int i = 0; i < 4; i++) {
            newByte[i] = (byte) ((ip[i] & 0xFF) & (mask[i] & 0xFF));
        }
        return newByte;
    }

    public static void print(byte[] bytes) {
        String[] arrBytes = new String[bytes.length];
        String newString = "";
        for (int i = 0; i < bytes.length; i++) {
            newString = Integer.toBinaryString(256 + (bytes[i] & 0xFF));
            String stringNew = newString.substring(1, newString.length());
            arrBytes[i] = stringNew;

        }
        System.out.println("//" + arrBytes[0] + " " + arrBytes[1] + " " + arrBytes[2] + " " + arrBytes[3]);
    }
}
