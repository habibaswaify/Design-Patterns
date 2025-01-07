package creation_patterns.prototype;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create original prototypes of different furniture items
        Chair originalChair = new Chair("Office Chair", new Dimensions(50,50,100), "Metal", Color.black, "arm chair",true);
        Table originalTable = new Table("Coffee Table", new Dimensions(50,50,50), "Wood", Color.DARK_GRAY, "square",4);
        Sofa originalSofa = new Sofa("Leather Sofa", new Dimensions(150,60,100), "Leather", Color.red, 3,true);

        // Clone the original furniture items and make adjustments to their properties
        Chair clonedChair = (Chair) originalChair.clone(); // Clone the original chair
        clonedChair.setName("Stool"); // Change name of cloned chair
        clonedChair.setType("stool"); // Change type of cloned chair
        clonedChair.setArmrests(false); // Change armrest option for cloned chair

        Sofa clonedSofa = (Sofa) originalSofa.clone(); // Clone the original sofa
        clonedSofa.setColor(Color.blue); // Change color of cloned sofa to blue

        Table clonedTable = (Table) originalTable.clone(); // Clone the original table
        clonedTable.setSeatingCapacity(6); // Change seating capacity for cloned table

        // Print the original and cloned furniture objects to compare their attributes
        System.out.println("Original Chair: " + originalChair);
        System.out.println("Cloned Chair: " + clonedChair);
        System.out.println("Original Sofa: " + originalSofa);
        System.out.println("Cloned Sofa: " + clonedSofa);
        System.out.println("Original Table: "+originalTable);
        System.out.println("Cloned Table:" + clonedTable);
    }
}
