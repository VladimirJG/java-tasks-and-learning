package sobes;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );

       /* Map<String, List<Double>> collect = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.mapping(Order::getCost, Collectors.toList())));
        System.out.println(collect);

        Map<String, List<Order>> collect1 = orders.stream().collect(Collectors.groupingBy(Order::getProduct));
        System.out.println(collect1);

        Map<String, Double> collect2 = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getCost)));
        System.out.println(collect2);

        List<Order> list = orders.stream().sorted(Comparator.comparing(Order::getCost).reversed()).toList();
        System.out.println(list);*/

      /*  List<Order> list = orders.stream().sorted(Comparator.comparing(Order::getCost).reversed()).limit(3).toList();
        System.out.println(list);

        double sum = list.stream().mapToDouble(Order::getCost).sum();
        System.out.println(sum);*/

        Map<String, List<Double>> collect = orders.stream()
                .collect(Collectors.groupingBy(Order::getProduct, Collectors.mapping(Order::getCost, Collectors.toList())));
        System.out.println(collect);

        Map<String, List<Order>> collect1 = orders.stream().collect(Collectors.groupingBy(Order::getProduct));
        System.out.println(collect1);

        Map<String, Double> collect2 = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getCost)));
        System.out.println(collect2);

        List<Order> collect3 = orders.stream().sorted(Comparator.comparing(Order::getCost).reversed()).collect(Collectors.toList());
        System.out.println(collect3);

        List<Order> collect4 = orders.stream().sorted(Comparator.comparing(Order::getCost).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(collect4);

        System.out.println(collect4.stream().mapToDouble(Order::getCost).sum());
    }

    static class Order {
        private String product;
        private double cost;

        public Order(String product, double cost) {
            this.product = product;
            this.cost = cost;
        }

        public String getProduct() {
            return product;
        }

        public double getCost() {
            return cost;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Order order = (Order) o;
            return Objects.equals(product, order.product);
        }

        @Override
        public int hashCode() {
            return Objects.hash(product);
        }

        @Override
        public String toString() {
            return "Order{" +
                    "product='" + product + '\'' +
                    ", cost=" + cost +
                    '}';
        }
    }
}
