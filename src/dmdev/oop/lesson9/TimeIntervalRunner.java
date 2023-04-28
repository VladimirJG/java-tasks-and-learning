package dmdev.oop.lesson9;

/**
 * Задача с 9 урока ооп
 */
public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval timeInterval = new TimeInterval(30, 5, 2);
        System.out.println(timeInterval.totalSecond());

        TimeInterval timeInterval1 = new TimeInterval(timeInterval.totalSecond());
        System.out.println(timeInterval1.totalSecond());

        timeInterval1.print();

        TimeInterval sumTimeInterval = timeInterval.sum(timeInterval1);
        sumTimeInterval.print();
    }
}
