package itrum.concurrency.synchronize;

import java.util.Random;

public class ComplexTask {
    public void execute() {
        Integer num = randomCalculation();
        System.out.println(num + " Запихиваем в БД");
    }

    private Integer randomCalculation() {
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += random.nextInt(100) * i;
        }
        System.out.println("Получаем" + sum);
        return sum;
    }
}
