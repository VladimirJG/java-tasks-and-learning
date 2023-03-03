package java_rush.cycles_l4;
//Вывести на экран квадрат из 10х10 букв S используя цикл while.
//Буквы в каждой строке не разделять.

public class L10S10 {
    public static void main(String[] args) {
       /* String s = "SSSSSSSSSS";
        int i = 0;
        while (i<10){
            System.out.println(s);
            i++;
        }*/
        int i = 0;
        while (i < 10) {
            int j = 0;
            while (j < 10) {
                System.out.print("S");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
