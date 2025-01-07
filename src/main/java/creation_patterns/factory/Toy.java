package creation_patterns.factory;

public class Toy implements IToy{
    private String name;
    private double price;
    private String material;
    private Size size;

    public Toy(String name, double price, String material, Size size) {
        this.name = name;
        this.price = price;
        this.material = material;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void manufacture() {
        System.out.println("Superclass: Manufacturing");
    }
    public void getToyDetails(){
        System.out.println("Name: "+this.name+ " Price: $"+this.price + " Material: "+this.material+ " Size: "+this.size);
    }
}
