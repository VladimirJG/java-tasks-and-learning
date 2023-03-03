package fabric;


public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop(new SimpleCoffeeFactory());
        Coffee  coffee = shop.orderCoffee(CoffeeType.CAPUCHINO);

    }
    private final SimpleCoffeeFactory coffeeFactory;

    public CoffeeShop(SimpleCoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {

        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
        System.out.println("Ваш кофе" + coffee);
        return coffee;
    }
}