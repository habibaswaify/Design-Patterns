package creation_patterns.prototype;

import java.awt.*;

public class Table extends Furniture{
    private String shape;
    private int seatingCapacity;

    public Table(String name, Dimensions dimensions, String material, Color color, String shape, int seatingCapacity) {
        super(name, dimensions, material, color);
        this.shape = shape;
        this.seatingCapacity = seatingCapacity;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
    @Override
    public String toString() {
        return super.toString() + " Shape: "+this.shape+" Seating Capacity: "+this.seatingCapacity;
    }
}
