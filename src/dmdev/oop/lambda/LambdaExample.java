package dmdev.oop.lambda;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        //2var//Comparator<Integer> comparator =  (Integer x, Integer y) -> {return Integer.compare(x,y);};  1var //new IntegerComparator();
       // Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y); //3var
        Comparator<Integer> comparator = Integer::compare; // 4 var
        System.out.println(comparator.compare(25, 100));
    }

   /* public static class IntegerComparator implements Comparator<Integer> {//1var

        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }*/
}

