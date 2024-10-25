package itrum.builder;

import java.util.Arrays;

import static itrum.builder.NYPizza.Size.SMALL;
import static itrum.builder.Pizza.Topping.*;

public class Example {
    public static void main(String[] args) {
        NYPizza nyPizza = new NYPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .addTopping(PEPPER)
                .build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
        System.out.println(nyPizza.toppings);
        System.out.println(calzone.toppings);
    }
}
