
package creation_patterns.builder;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList("onions", "olives", "fried chicken"));
        Director director = new Director();
        Pizza customPizza = new Pizza.CPizzaBuilder()
                                .name("My Pizza")
                                .cheese("cheddar")
                                .crustType("stuffed")
                                .sauce("ranch")
                                .size("small")
                                .toppings(toppings)
                                .build();
        Pizza margherita  = director.buildMargherita();
        Pizza pep = director.buildPepperoni();
        Pizza hawaii = director.buildHawaiian();
        System.out.println(customPizza.toString());
        System.out.println(margherita .toString());
        System.out.println(pep.toString());
        System.out.println(hawaii.toString());
        
    }
}
