package sobes;

public class GenericFruit {
     static class Fruit {
        int weight;
    }

     static class Citrus extends Fruit{
        int weight;
    }

     static class Orange extends Citrus {
        int color;
    }

     static class BigRoundOrange extends Orange {
        int size = 100;
    }

    public static void main(String[] args) {
        Fruit fruit = new Orange();
        Citrus citrus = new Citrus();
        Orange orange = new Orange();

    }
}
