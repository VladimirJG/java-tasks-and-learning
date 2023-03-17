package other_task;



//1.0. Максимальное, минимальное и среднее значение
//
//Задача:
//
//Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
//
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
public class Task5 {
    public static void main(String[] args) {
        double[] arr = new double[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        double min = arr[0];
        double max = arr[0];
        double avr = 0;
        for (double v : arr) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
            avr += v;
        }
        System.out.println("min: " + min + " max: " + max + " avr: " + avr/ arr.length);
    }
}
