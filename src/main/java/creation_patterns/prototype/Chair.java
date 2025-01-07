package creation_patterns.prototype;

import java.awt.*;

public class Chair extends Furniture{
    private String type;
    private  boolean armrests;

    public Chair(String name, Dimensions dimensions, String material, Color color, String type, boolean armrests) {
        super(name, dimensions, material, color);
        this.type = type;
        this.armrests = armrests;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isArmrests() {
        return armrests;
    }

    public void setArmrests(boolean armrests) {
        this.armrests = armrests;
    }

    @Override
    public String toString() {
        return super.toString() + " Type: "+this.type+" Has Armrests: "+this.armrests;
    }
}
