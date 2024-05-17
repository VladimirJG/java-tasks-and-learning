package sobes;

import java.util.Arrays;

public class TestXOR {
    public static void main(String[] args) {
//        int[]arr = {2,1,2,4,1,4,5,7,7};
//        int singleNumber = 0;
//
//        for (Integer i : arr){
//            singleNumber ^=i;
//        }
//        System.out.println(singleNumber);

        String[] arr = {"a", "d", "f", "a", "c", "f", "d"};
        /*int num = 0;
        for (String s : arr){
            num^=s.charAt(0);
        }
        System.out.println(num);
        System.out.println((char) num);*/

        int n = Arrays.stream(arr)
                .map(s -> (int) s.charAt(0))
                .reduce(0, (x, y) -> x ^ y);

        System.out.println((char) n);
    }


}
