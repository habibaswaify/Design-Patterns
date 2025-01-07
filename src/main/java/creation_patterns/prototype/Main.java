package creation_patterns.prototype;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create prototypes
        Chair originalChair = new Chair("Office Chair", new Dimensions(50,50,100), "Metal", Color.black, "arm chair",true);
        Table originalTable = new Table("Coffee Table", new Dimensions(50,50,50), "Wood", Color.DARK_GRAY, "square",4);
        Sofa originalSofa = new Sofa("Leather Sofa", new Dimensions(150,60,100), "Leather", Color.red, 3,true);
        // Clone furniture
        Chair clonedChair = (Chair) originalChair.clone();
        clonedChair.setName("Stool");
        clonedChair.setType("stool");
        clonedChair.setArmrests(false);
        Sofa clonedSofa = (Sofa) originalSofa.clone();
        clonedSofa.setColor(Color.blue);
        Table clonedTable = (Table) originalTable.clone();
        clonedTable.setSeatingCapacity(6);

        System.out.println("Original Chair: " + originalChair);
        System.out.println("Cloned Chair: " + clonedChair);
        System.out.println("Original Sofa: " + originalSofa);
        System.out.println("Cloned Sofa: " + clonedSofa);
        System.out.println("Original Table: "+originalTable);
        System.out.println("Cloned Table:" + clonedTable);
    }
}
