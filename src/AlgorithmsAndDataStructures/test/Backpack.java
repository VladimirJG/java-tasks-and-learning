package AlgorithmsAndDataStructures.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Backpack {
    public static void main(String[] args) {
        int backpackWeight = 7;

        final Thing apple = new Thing("Apple", 20, 4);
        final Thing water = new Thing("Water", 18, 3);
        final Thing persimmon = new Thing("Persimmon", 14, 2);
        List<Thing> allItems = new ArrayList<>();
        allItems.add(apple);
        allItems.add(water);
        allItems.add(persimmon);
        totalPriceOfItemsTaken(allItems, backpackWeight);
    }

    private static int totalPriceOfItemsTaken(List<Thing> allItems, int backpackWeight) {
        allItems.sort(Comparator.comparingDouble(Thing::resultOfDividingThePriceByWeight).reversed());
        System.out.println(allItems);
        return 5;

    }

    public static class Thing {
        private String title;
        private int price;
        private int weight;

        public Thing(String title, int price, int weight) {
            this.title = title;
            this.price = price;
            this.weight = weight;
        }


        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Thing{" +
                    "title='" + title + '\'' +
                    ", price=" + price +
                    ", weight=" + weight +
                    '}';
        }

        public static double resultOfDividingThePriceByWeight(Thing thing) {
            return (double) thing.getPrice() / thing.getWeight();
        }
    }
}
