package java_rush.lesson6;
//Реализовать статический метод double getDistance(x1, y1, x2, y2).
// Он должен вычислять расстояние между точками.
//Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра.
public class L8СуммаКвадратовРазностиКоординат {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код // Не решил. Рушуние JR
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

    }
}
