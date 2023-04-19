package JavaR3.operator.task1;

public class TestEnd {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        print(ip);
    }
    public static void print(byte[] bytes) {
        for (byte b: bytes) {
            System.out.format("%08d ", Integer.parseInt(Integer.toBinaryString(b & 0xFF)));
        }
    }
}
