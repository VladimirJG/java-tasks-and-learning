package dmdev.oop.lesson9;

public class TimeInterval {
    private static final int SECOND_IN_MINUTE = 60;
    private static final int MINUTE_IN_HOUR = 60;
    private int second;
    private int minute;
    private int hour;

    public TimeInterval(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public TimeInterval(int totalSecond) {
        this.hour = totalSecond / 3600;
        this.minute = totalSecond % 3600 / 60;
        this.second = totalSecond % 3600 % 60;
    }

    public int totalSecond() {
        return second + minute * SECOND_IN_MINUTE + hour * MINUTE_IN_HOUR * SECOND_IN_MINUTE;
    }

    public void print() {
        System.out.println(hour + " " + minute + " " + second);
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(this.totalSecond() + second.totalSecond());
    }
}
