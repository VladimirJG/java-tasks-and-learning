package AlgorithmsAndDataStructures.test;

import java.util.ArrayList;
import java.util.Collections;
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
    }

    private static int totalPriceOfItemsTaken(List<Thing> allItems, int backpackWeight) {
        allItems.stream().sorted(Collections.reverseOrder(Thing::))
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

        public List<Thing> sortedAtAPricePerPiece(List<Thing> listThings) {
            for (int i = 0; i < listThings.size(); i++) {

            }
            listThings.stream().sorted(Thing::getPrice/getWeight())

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
    }
}
