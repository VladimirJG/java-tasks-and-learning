package tin.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Subscriptions {
    public static void main(String[] args) {
        List<Subscription> list = addSubscriptions();
        System.out.println(totalApplications(list));
        System.out.println(replacementMinMaxTotal(list));

    }

    public static int replacementMinMaxTotal(List<Subscription> list) {
        int minusMax = Collections.max(list.stream().filter(s -> s.numberOfDay % 2 != 0).map(c -> c.subscriptionAmount).toList());
        int plusMax = Collections.max(list.stream().filter(s -> s.numberOfDay % 2 == 0).map(c -> c.subscriptionAmount).toList());
        System.out.println(minusMax);
        System.out.println(plusMax);
        return totalApplications(list) - minusMax * 2 + plusMax * 2;
    }

    public static int totalApplications(List<Subscription> list) {
        int count = 0;
        for (Subscription s : list) {
            if (s.numberOfDay % 2 == 0)
                count += s.subscriptionAmount;
            else
                count -= s.subscriptionAmount;
        }
        return count;
    }

    public static List<Subscription> addSubscriptions() {
        List<Subscription> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(new Subscription(i + 1, random.nextInt(100)));
        }
        System.out.println(list);
        return list;
    }

    public static class Subscription {
        private final int numberOfDay;
        private final int subscriptionAmount;

        public Subscription(int numberOfDay, int subscriptionAmount) {
            this.numberOfDay = numberOfDay;
            this.subscriptionAmount = subscriptionAmount;
        }


        @Override
        public String toString() {
            return "Subscription{" +
                    "numberOfDay=" + numberOfDay +
                    ", subscriptionAmount=" + subscriptionAmount +
                    '}';
        }
    }
}
