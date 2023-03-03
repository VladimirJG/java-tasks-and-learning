package fabric;

public class SimpleCoffeeFactory {
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type) {
            case AMERICANO:
                coffee = new Americano();
                break;
            case CAPUCHINO:
                coffee = new Capuchino();
                break;
        }
        return coffee;
    }
}
