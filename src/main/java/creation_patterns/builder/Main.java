package creation_patterns.builder;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Create a list of toppings for a custom pizza
        ArrayList<String> toppings = new ArrayList<>(Arrays.asList("onions", "olives", "fried chicken"));

        // Create a Director object that will manage the construction of different pizza types
        Director director = new Director();

        // Using the builder pattern to create a custom pizza with specific ingredients
        Pizza customPizza = new Pizza.CPizzaBuilder()
                .name("My Pizza")              // Set the pizza name
                .cheese("cheddar")            // Set the type of cheese
                .crustType("stuffed")         // Set the type of crust
                .sauce("ranch")               // Set the sauce type
                .size("small")                // Set the pizza size
                .toppings(toppings)           // Set the toppings
                .build();                     // Build the custom pizza

        // Create predefined pizza types using the Director
        Pizza margherita = director.buildMargherita(); // Build a Margherita pizza
        Pizza pep = director.buildPepperoni();         // Build a Pepperoni pizza
        Pizza hawaii = director.buildHawaiian();       // Build a Hawaiian pizza

        // Print the details of each pizza method
        System.out.println(customPizza.toString());  // Print the custom pizza
        System.out.println(margherita.toString());   // Print the Margherita pizza
        System.out.println(pep.toString());          // Print the Pepperoni pizza
        System.out.println(hawaii.toString());       // Print the Hawaiian pizza
    }
}
