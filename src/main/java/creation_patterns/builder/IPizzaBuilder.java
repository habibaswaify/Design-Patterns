
package creation_patterns.builder;

import java.util.ArrayList;

public interface IPizzaBuilder {
    IPizzaBuilder name(String name);
    IPizzaBuilder crustType(String crustType);
    IPizzaBuilder size(String size);
    IPizzaBuilder toppings(ArrayList<String> toppings);
    IPizzaBuilder sauce(String sauce);
    IPizzaBuilder cheese(String cheese);
    Pizza build();
}
