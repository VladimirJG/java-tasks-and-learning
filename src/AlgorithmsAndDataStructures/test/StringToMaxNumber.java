package AlgorithmsAndDataStructures.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringToMaxNumber {
    public static void main(String[] args) {
        String str = "317995";
        System.out.println(strToMaxInt(str));
    }

    private static int strToMaxInt(String s) {
        List<Integer> intNum = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            intNum.add(Character.getNumericValue(s.charAt(i)));
        }
        StringBuilder m = new StringBuilder();
        Collections.sort(intNum);
        for (int i = intNum.size() - 1; i >= 0; i--) {
            m.append(intNum.get(i));
        }
        return Integer.parseInt(String.valueOf(m));
    }
}
