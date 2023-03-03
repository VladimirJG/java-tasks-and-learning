package java_rush_java_core.lesson_1;

import java.util.Arrays;

//Реализуй метод, который возвращает объект класса Pair. В поле x этого объекта
// должно содержаться минимальное число, а в поле y - максимальное число из массива inputArray.
//
//Требования:
//•	Программа не должна считывать данные с клавиатуры.
//•	Класс Pair не изменяй.
//•	Метод main не изменяй.
//•	Допиши реализацию метода getMinimumMaximumPair: он должен возвращать пару из минимума и максимума.
//•	Программа должна вывести правильный результат.
//•	Метод getMinimumMaximumPair не должен изменять массив inputArray.
public class L11last {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int[] newArray = Arrays.copyOf(inputArray, inputArray.length);
        Arrays.sort(newArray);
        int min = newArray[0];
        int max = newArray[newArray.length-1];
        // напишите тут ваш код

        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
