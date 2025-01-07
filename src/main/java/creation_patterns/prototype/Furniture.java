package creation_patterns.prototype;

import java.awt.*;

public abstract class Furniture implements Cloneable{
    String name;
    Dimensions dimensions;
    String material;
    Color color;

    public Furniture(String name, Dimensions dimensions, String material, Color color) {
        this.name = name;
        this.dimensions = dimensions;
        this.material = material;
        this.color = color;
    }

    @Override
    public Furniture clone() {
        try {
            Furniture clone = (Furniture) super.clone();
            clone.setColor(this.color);
            clone.setDimensions(this.dimensions.clone());
            clone.setMaterial(this.material);
            clone.setName(this.name);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String hexString = String.format("#%02X%02X%02X", color.getRed(), color.getGreen(), color.getBlue());
        return "Name: "+this.name+" Dimensions: "+this.dimensions.getLength()+ "x"
                +this.dimensions.getWidth()+ "x" +this.dimensions.getHeight()+" Material: "+this.material+ " Color: " +hexString;
    }
}
