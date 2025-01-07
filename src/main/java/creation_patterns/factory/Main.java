package creation_patterns.factory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // An array list to hold a collection of Toy objects
        ArrayList<Toy> toys = new ArrayList<>();

        // Creating an instance of the ToyFactory to create toy objects
        ToyFactory toyFactory = new ToyFactory();

        try {
            // Adding various toys created by the factory to the toys list
            toys.add(toyFactory.createToy("Car", 5.05, "plastic", Size.small)); // Small plastic car
            toys.add(toyFactory.createToy("Doll", 10.25, "fabric", Size.large)); // Large fabric doll
            toys.add(toyFactory.createToy("ActionFigure", 20.0, "plastic", Size.large)); // Large plastic action figure

            // Testing an invalid case where the toy's type is not defined
            // toys.add(toyFactory.createToy("Robot", 57.05, "plastic", Size.small)); // Invalid robot size

            // Loop through the toys list to manufacture and display details of each toy
            for (Toy toy : toys) {
                toy.manufacture(); // Simulate manufacturing of each toy
                toy.getToyDetails(); // Get and print the details of the toy
            }
        } catch (Exception e) {
            // Catching any exception that might occur during toy creation and manufacturing
            System.out.println("Exception caught: " + e); // Print the exception message
        }
    }
}
