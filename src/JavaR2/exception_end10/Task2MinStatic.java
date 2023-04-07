package JavaR2.exception_end10;

//Расставь как можно меньше модификаторов static так, чтобы пример скомпилировался.
public class Task2MinStatic {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Task2MinStatic solution = new Task2MinStatic();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Task2MinStatic.D = 5 * D * C;

        Task2MinStatic.D = 5;
    }

    public int getA() {
        return A;
    }

}
