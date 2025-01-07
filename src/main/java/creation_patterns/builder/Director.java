
package creation_patterns.builder;

import java.util.ArrayList;
import java.util.Arrays;

public class Director {

    
    public Pizza buildMargherita(){
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList("onions","olives"));
        return new Pizza.CPizzaBuilder().name("Margherita").
                cheese("Mozzarella").
                crustType("thin").
                sauce("tomato sauce").
                size("medium").
                toppings(toppings).build();
    }
    public Pizza buildHawaiian(){
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList("onions","olives","chicken","pineapple"));
        return new Pizza.CPizzaBuilder().name("Hawaiian").
                cheese("mozzarella").
                crustType("thin").
                sauce("tomato sauce").
                size("medium").
                toppings(toppings).build();
    }
    public Pizza buildPepperoni(){
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList("onions","olives","pepperoni"));
        return new Pizza.CPizzaBuilder().name("Pepperoni").
                cheese("mozzarella").
                crustType("normal").
                sauce("tomato sauce").
                size("medium").
                toppings(toppings).build();
    }
}
