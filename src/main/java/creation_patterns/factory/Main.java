package creation_patterns.factory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // An array list to hold a number of toys
        ArrayList<Toy> toys = new ArrayList<>();
        ToyFactory toyFactory = new ToyFactory();
        try{
            toys.add(toyFactory.createToy("Car",5.05,"plastic",Size.small));
            toys.add(toyFactory.createToy("Doll",10.25,"fabric",Size.large));
            toys.add(toyFactory.createToy("ActionFigure",20.0,"plastic",Size.large));
            toys.add(toyFactory.createToy("Robot",57.05,"plastic",Size.small)); // Testing invalid case
            for(Toy toy:toys){
                toy.manufacture();
                toy.getToyDetails();
            }
        } catch (Exception e) {
            System.out.println("Exception caught:" + e);
        }

    }
}
