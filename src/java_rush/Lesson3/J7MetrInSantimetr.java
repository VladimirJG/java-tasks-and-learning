package java_rush.Lesson3;
/*Реализуй метод getMetreFromCentimetre(int centimetre).
        Метод на вход принимает количество сантиметров. Нужно сделать так,
        чтобы метод возвращал число полных метров в centimetre. (1 метр = 100 см).*/
public class J7MetrInSantimetr {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
       int metre = centimetre/100;
        return  metre;
        //Мое решение// return centimetre/100;
    }
}
