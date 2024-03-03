package itrum.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

class Order {
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
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", cost=" + cost +
                '}';
    }
}

public class StreamCollectorsExample {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Laptop", 1200.0),
                new Order("Smartphone", 800.0),
                new Order("Laptop", 1500.0),
                new Order("Tablet", 500.0),
                new Order("Smartphone", 900.0)
        );


        System.out.println("-----Создайте список заказов с разными продуктами и их стоимостями-----");
        AtomicInteger atomicInteger = new AtomicInteger(1);
        Map<Integer, Order> orderMap = orders.stream()
                .collect(Collectors.toMap(order -> atomicInteger.getAndIncrement(), Function.identity()));
        System.out.println(orderMap);

        System.out.println("-----Группируйте заказы по продуктам.-----");
        Map<String, List<Order>> collect = orders.stream().collect(Collectors.groupingBy(Order::getProduct));
        System.out.println(collect);

        System.out.println("-----Для каждого продукта найдите общую стоимость всех заказов.-----");
        Map<String, Double> collect1 = orders.stream().collect(Collectors.groupingBy(Order::getProduct, Collectors.summingDouble(Order::getCost)));
        System.out.println(collect1);

        System.out.println("-----Отсортируйте продукты по убыванию общей стоимости.-----");
        List<Map.Entry<String, Double>> collect2 = collect1.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).toList();
        System.out.println(collect2);

        System.out.println("-----Выберите три самых дорогих продукта.-----");
        List<Order> highestValues = orderMap.values().stream()
                .sorted(Comparator.comparingDouble(Order::getCost).reversed())
                .limit(3).toList();
        System.out.println(highestValues);

        System.out.println("-----Выведите результат: список трех самых дорогих продуктов и их общая стоимость.-----");
        double sum = highestValues.stream().mapToDouble(Order::getCost).sum();
        System.out.println(sum);
    }
}